import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandLineInput {
    private final String[] args;
    private String mode;
    private int key;
    private String data;
    private String out;
    private String algorithm;


    private final Map<String, String> commandLineArgs;

    CommandLineInput(String[] args) {
        this.args = args;
        this.commandLineArgs = new HashMap<>();
        for (int i = 0; i < args.length - 1; i += 2) {
            commandLineArgs.put(args[i], args[i + 1]);
        }
        setValues();
    }

    public boolean isValidInput() {

        for (int i = 0; i < args.length; i += 2) {
            if (i + 1 == args.length ||
                    "-in".equals(args[i + 1]) ||
                    "-out".equals(args[i + 1]) ||
                    "-mode".equals(args[i + 1]) ||
                    "-key".equals(args[i + 1]) ||
                    "-data".equals(args[i + 1]) ||
                    "-alg".equals(args[i + 1])) {
                System.out.printf("argument %s is missing a value%n", args[i]);
                return false;
            }
        }
        return true;
    }

    private void setValues() {
        mode = commandLineArgs.getOrDefault("-mode", "enc");
        key = Integer.parseInt(commandLineArgs.getOrDefault("-key", "0"));
        out = commandLineArgs.getOrDefault("-out", "");
        algorithm = commandLineArgs.getOrDefault("-alg", "shift");
        if (!commandLineArgs.containsKey("-data") && !commandLineArgs.containsKey("-in")) {
            data = "";
        } else if (commandLineArgs.containsKey("-data")) {
            data = commandLineArgs.getOrDefault("-data", "");
        } else {
            File file = new File(commandLineArgs.get("-in"));
            try (Scanner scanner = new Scanner(file)) {
                data = scanner.nextLine();
            } catch (FileNotFoundException e) {
                data = "";
                System.out.println("input File not found");
            }
        }
    }

    public String getMode() {
        return mode;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public String getOut() {
        return out;
    }

    public String getAlgorithm() {
        return algorithm;
    }
}
