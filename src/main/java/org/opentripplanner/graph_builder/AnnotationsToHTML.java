package org.opentripplanner.graph_builder;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.opentripplanner.graph_builder.annotation.GraphBuilderAnnotation;
import org.opentripplanner.graph_builder.module.GraphBuilderModuleSummary;
import org.opentripplanner.graph_builder.module.GraphBuilderTaskSummary;
import org.opentripplanner.graph_builder.services.GraphBuilderModule;
import org.opentripplanner.routing.graph.Graph;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class generates nice HTML graph annotations reports 
 * 
 * They are created with the help of getHTMLMessage function in {@link GraphBuilderAnnotation} derived classes.
 * @author mabu
 */
public class AnnotationsToHTML implements GraphBuilderModule {

    private static Logger LOG = LoggerFactory.getLogger(AnnotationsToHTML.class); 

    //Path to output folder
    private File outPath;

    //If there are more then this number annotations are split into multiple files
    //This is because browsers aren't made for giant HTML files which can be made with 500k annotations
    private int maxNumberOfAnnotationsPerFile;


    //This counts all occurrences of HTML annotations classes
    //If one annotation class is split into two files it has two entries in this Multiset
    //IT is used to show numbers in HTML files name and links
    Multiset<String> annotationClassOccurences;

    //List of writers which are used for actual writing annotations to HTML
    List<HTMLWriter> writers;

    //Key is classname, value is annotation message
    //Multimap because there are multiple annotations for each classname
    private Multimap<String, String> annotations;
  
    public AnnotationsToHTML (File outpath, int maxNumberOfAnnotationsPerFile) {
        this.outPath = outpath;
        annotations = ArrayListMultimap.create();
        this.maxNumberOfAnnotationsPerFile = maxNumberOfAnnotationsPerFile;
        this.writers = new ArrayList<>();
        this.annotationClassOccurences = HashMultiset.create();
    }


    @Override
    public void buildGraph(Graph graph, GraphBuilderModuleSummary graphBuilderModuleSummary) {

        if (outPath == null) {
            LOG.error("Saving folder is empty!");
            return;
        }

        outPath = new File(outPath, "report");
        if (outPath.exists()) {
            //Removes all files from report directory
            try {
                FileUtils.cleanDirectory(outPath);
            } catch (IOException e) {
                LOG.error("Failed to clean HTML report directory: " + outPath.toString() + ". HTML report won't be generated!", e);
                return;
            }
        } else {
            //Creates report directory if it doesn't exist yet
            try {
                FileUtils.forceMkdir(outPath);
            } catch (IOException e) {
                e.printStackTrace();
                LOG.error("Failed to create HTML report directory: " + outPath.toString() + ". HTML report won't be generated!", e);
                return;
            }
        }



        //Groups annotations in multimap according to annotation class
        for (GraphBuilderAnnotation annotation : graph.getBuilderAnnotations()) {
            //writer.println("<p>" + annotation.getHTMLMessage() + "</p>");
            // writer.println("<small>" + annotation.getClass().getSimpleName()+"</small>");
            addAnnotation(annotation);

        }
        LOG.info("Creating Annotations log");


        //Creates list of HTML writers. Each writer has whole class of HTML annotations
        //Or multiple HTML writers can have parts of one class of HTML annotations if number
        // of annotations is larger than maxNumberOfAnnotationsPerFile
        for (Map.Entry<String, Collection<String>> entry: annotations.asMap().entrySet()) {
            List<String> annotationsList;
            if (entry.getValue() instanceof List) {
                annotationsList = (List<String>) entry.getValue();
            } else {
                annotationsList = new ArrayList<>(entry.getValue());
            }
            addAnnotations(entry.getKey(), annotationsList);
        }

        //Actual writing to the file is made here since
        // this is the first place where actual number of files is known (because it depends on annotations count)
        for (HTMLWriter writer : writers) {
            writer.writeFile(annotationClassOccurences, false);
        }

        try {
            HTMLWriter indexFileWriter = new HTMLWriter("index", graph.getBuilderSummaries());
            indexFileWriter.writeFile(annotationClassOccurences, true);
        } catch (FileNotFoundException e) {
            LOG.error("Index file coudn't be created:{}", e);
        }

        LOG.info("Annotated logs are in {}", outPath);


    }

    /**
     * Creates file with given class of annotations
     *
     * If number of annotations is larger then maxNumberOfAnnotationsPerFile multiple files are generated.
     * And named annotationClassName1,2,3 etc.
     *
     * @param annotationClassName name of annotation class and then also filename
     * @param annotations list of all annotations with that class
     */
    private void addAnnotations(String annotationClassName, List<String> annotations) {
        try {
            HTMLWriter file_writer;
            if (annotations.size() > 1.2*maxNumberOfAnnotationsPerFile) {
                LOG.debug("Number of annotations is very large. Splitting: {}", annotationClassName);
                List<List<String>> partitions = Lists.partition(annotations, maxNumberOfAnnotationsPerFile);
                for (List<String> partition: partitions) {
                    annotationClassOccurences.add(annotationClassName);
                    int labelCount = annotationClassOccurences.count(annotationClassName);
                    file_writer =new HTMLWriter(annotationClassName+Integer.toString(labelCount), partition);
                    writers.add(file_writer);
                }

            } else {
                annotationClassOccurences.add(annotationClassName);
                int labelCount = annotationClassOccurences.count(annotationClassName);
                file_writer = new HTMLWriter(annotationClassName + Integer.toString(labelCount),
                    annotations);
                writers.add(file_writer);
            }
        } catch (FileNotFoundException ex) {
            LOG.error("Output folder not found:{} {}", outPath, ex);
        }
    }

    @Override
    public void checkInputs() {

    }

    /**
     * Groups annotations according to annotation class name
     *
     * All annotations are saved together in multimap where key is annotation classname
     * and values are list of annotations with that class
     * @param annotation
     */
    private void addAnnotation(GraphBuilderAnnotation annotation) {
        String className = annotation.getClass().getSimpleName();
        annotations.put(className, annotation.getHTMLMessage());
    }

    class HTMLWriter {
        private PrintStream out;

        private Multimap<String, String> writerAnnotations;

        private String annotationClassName;

        private List<GraphBuilderModuleSummary> graphBuilderModuleSummaries = null;

        public HTMLWriter(String key, Collection<String> annotations) throws FileNotFoundException {
            LOG.debug("Making file: {}", key);
            File newFile = new File(outPath, key +".html");
            FileOutputStream fileOutputStream = new FileOutputStream(newFile);
            this.out = new PrintStream(fileOutputStream);
            writerAnnotations = ArrayListMultimap.create();
            writerAnnotations.putAll(key, annotations);
            annotationClassName = key;
        }

        public HTMLWriter(String filename, List<GraphBuilderModuleSummary> graphBuilderModuleSummaries)
            throws FileNotFoundException {
            LOG.debug("Making file: {}", filename);
            File newFile = new File(outPath, filename +".html");
            FileOutputStream fileOutputStream = new FileOutputStream(newFile);
            this.out = new PrintStream(fileOutputStream);
            annotationClassName = filename;
            this.graphBuilderModuleSummaries = graphBuilderModuleSummaries;
        }

        private void writeFile(Multiset<String> classes, boolean isIndexFile) {
            println("<html><head><title>Graph report for " + outPath.getParentFile()
                + "Graph.obj</title>");
            println("\t<meta charset=\"utf-8\">");
            println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
            println("<script src='http://code.jquery.com/jquery-1.11.1.js'></script>");
            println(
                "<link rel='stylesheet' href='http://yui.yahooapis.com/pure/0.5.0/pure-min.css'>");
            String css = "\t\t<style>\n"
                + "\n"
                + "\t\t\tbody {\n"
                + "\t\t\t\tmargin:8px;\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\tbutton.pure-button {\n"
                + "\t\t\t\tmargin:5px;\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\tspan.pure-button {\n"
                + "\t\t\t\tcursor:default;\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\t.button-graphwide,\n"
                + "\t\t\t.button-parkandrideunlinked,\n"
                + "\t\t\t.button-graphconnectivity,\n"
                + "\t\t\t.button-turnrestrictionbad\t{\n"
                + "\t\t\t\tcolor:white;\n"
                + "\t\t\t\ttext-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\t.button-graphwide {\n"
                + "\t\t\t\tbackground: rgb(28, 184, 65); /* this is a green */\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\t.button-parkandrideunlinked {\n"
                + "\t\t\t\tbackground: rgb(202, 60, 60); /* this is a maroon */\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\t.button-graphconnectivity{\n"
                + "\t\t\t\tbackground: rgb(223, 117, 20); /* this is an orange */\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\t.button-turnrestrictionbad {\n"
                + "\t\t\t\tbackground: rgb(66, 184, 221); /* this is a light blue */\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\tth, td {\n"
                + "\t\t\t\tborder: 1px solid black;\n"
                + "\t\t\t\tpadding: 5px;\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\ttable {\n"
                + "\t\t\t\tmargin: 5px;\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\t.subtasks table {\n"
                + "\t\t\t\tmargin: 0;\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t\t.subtasks td {\n"
                + "\t\t\t\tborder: none;\n"
                + "\t\t\t\tmin-width: 145px;\n"
                + "\t\t\t}\n"
                + "\n"
                + "\t\t</style>\n"
                + "";
            println(css);
            println("</head><body>");
            println(isIndexFile
                ? "<h1>OpenTripPlanner Graph Build Report</h1>"
                : String.format("<h1>OpenTripPlanner annotations log for %s</h1>", annotationClassName));
            println("<h2>Graph report for " + outPath.getParentFile() + "Graph.obj</h2>");
            println("<p>");
            // add link for home page
            println(isIndexFile
                ? "<button class='pure-button pure-button-disabled'>Home</button>"
                : "<a class='pure-button' href=\"index.html\">Home</a>"
            );
            //adds links to the other HTML files
            for (Multiset.Entry<String> htmlAnnotationClass : classes.entrySet()) {
                String label_name = htmlAnnotationClass.getElement();
                String label;
                int currentCount = 1;
                //it needs to add link to every file even if they are split
                while (currentCount <= htmlAnnotationClass.getCount()) {
                    label = label_name + currentCount;
                    if (label.equals(annotationClassName)) {
                        println(String.format("<button class='pure-button pure-button-disabled button-%s'>%s</button>",
                            label_name.toLowerCase(), label));
                    } else {
                        println(String.format("<a class='pure-button button-%s' href=\"%s.html\">%s</a>",
                            label_name.toLowerCase(), label, label));
                    }
                    currentCount++;
                }
            }
            println("</p>");
            if (isIndexFile) {
                writeIndexContent();
            } else {
                println("<ul id=\"log\">");
                writeAnnotations();
                println("</ul>");
            }

            println("</body></html>");

            close();
        }

        /**
         * Writes the index page contents.
         */
        private void writeIndexContent() {
            println("<h3>Graph builder module report</h3>");
            println("<table>");
            println("<thead>");
            println("<tr><th>Graph Builder Module</th><th>Processing time</th><th>Subtasks</th></tr>");
            println("</thead>");
            println("<tbody>");
            long totalDuration = 0;
            for (GraphBuilderModuleSummary summary : graphBuilderModuleSummaries) {
                totalDuration += summary.getDuration();
            }

            for (GraphBuilderModuleSummary summary: graphBuilderModuleSummaries) {
                StringBuilder summaryLine = new StringBuilder();
                summaryLine.append(
                    String.format(
                        "<tr><td>%s</td><td>%.1fs (%.0f%%)</td><td class=\"subtasks\">",
                        summary.getName(),
                        summary.getDuration() / 1000.0,
                        summary.getDuration() * 1.0 / totalDuration * 100
                    )
                );
                if (summary.getSubTasks().size() > 0) {
                    summaryLine.append("<table>");
                    for (GraphBuilderTaskSummary subTask : summary.getSubTasks()) {
                        String subTaskName = subTask.getName();
                        summaryLine.append(
                            String.format(
                                "<tr><td>%s</td><td>%.1fs (%.0f%%)</td></tr>",
                                subTaskName,
                                subTask.getDuration() / 1000.0,
                                subTask.getDuration() * 1.0 / summary.getDuration() * 100
                            )
                        );
                    }
                    summaryLine.append("</table>");
                }
                summaryLine.append("</td></tr>");
                println(summaryLine.toString());
            }
            println("</tbody>");
            println("</table>");

            println("<h3>Annotations</h3>");
            println("<table>");
            println("<thead>");
            println("<tr><th>Annotation Class</th><th>Number of annotations</th></tr>");
            println("</thead>");
            println("<tbody>");
            for (String className : annotations.keySet()) {
                println(
                    String.format(
                        "<tr><td>%s</td><td>%d</td></tr>",
                        className,
                        annotations.get(className).size()
                    )
                );
            }
            println("</tbody>");
            println("</table>");
        }

        /**
         * Writes annotations as LI html elements
         */
        private void writeAnnotations() {
            String annotationFMT = "<li>%s</li>";
            for (Map.Entry<String, String> annotation: writerAnnotations.entries()) {
                print(String.format(annotationFMT, annotation.getValue()));
            }
        }

        private void println(String bodyhtml) {
            out.println(bodyhtml);
        }

        private void print(String bodyhtml) {
            out.print(bodyhtml);
        }

        private void close() {
            out.close();
        }


        
        /**
         * Generates JSON from annotations variable which is used by Javascript
         * to display HTML report
         */
        private void writeJson() {
            try {
 
                out.print("\tvar data=");
                ObjectMapper mapper = new ObjectMapper();
                JsonGenerator jsonGenerator = mapper.getJsonFactory().createJsonGenerator(out);
                
                mapper.writeValue(jsonGenerator, writerAnnotations.asMap());
                out.println(";");

            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(AnnotationsToHTML.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
