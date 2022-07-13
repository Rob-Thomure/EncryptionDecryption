import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Output {
    private final String out;
    private final String text;

    Output(String out, String text) {
        this.out = out;
        this.text = text;
    }

    public void print() {
        if (out.isEmpty()) {
            System.out.println(text);
        } else {
            // save to a file
            File file = new File(out);
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Failed to create file");
            }
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.println(text);
            } catch (FileNotFoundException e) {
                System.out.println("Failed to save to file");
            }
        }
    }
}
