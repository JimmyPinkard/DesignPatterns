import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Utility Class, because I'm tired of handwriting these songs.
 */
public class SongGen {

    public static void main(final String[] args) {
        new SongGen().run(args);
    }

    private void fatal(String message) {
        System.err.println(message);
        System.exit(1);
    }

    private void run(final String[] args) {
        if(args.length != 1) {
            fatal("Must be ran as: SongGen <method-name>");
        }
        final String[] lyrics = readFile("lyrics/input.txt");
        final String method = genMethod(args[0], lyrics);
        writeFile("lyrics/output.txt", method);
        System.out.println("Method Generated.");
    }

    private String[] readFile(final String path) {
        File file = new File(path);
        final List<String> lyrics = new ArrayList<>();
        try {
            Scanner in = new Scanner(file);
            while(in.hasNextLine()) {
                lyrics.add(in.nextLine());
            }
        }
        catch (Exception e) {
            fatal(e.getMessage());
        }
        return lyrics.toArray(new String[0]);
    }

    private void writeFile(final String path, final String contents) {
        try
        {
            final File file = new File(path);
            final FileWriter writer = new FileWriter(file);
            writer.write(contents);
            writer.close();
        }
        catch (Exception e) {
            fatal(e.getMessage());
        }
    }

    private String genMethod(final String methodName, final String[] lyrics) {
        StringBuilder builder = new StringBuilder();
        builder.append("\tpublic void ").append(methodName).append("() {\n");
        builder.append("\t\tfinal java.util.List<String> lyrics = new java.util.ArrayList<>();\n");
        for(int i = 2; i < lyrics.length; ++i) {
            builder.append("\t\tlyrics.add(\"").append(lyrics[i]).append("\");\n");
        }
        builder.append("\t\tbox.playSong(\"").append(lyrics[0]).append("\", lyrics").append(");\n");
        return builder.append("\t}\n").toString();
    }
}