import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String encDec;
        String text;
        int key;
        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            encDec = scanner.nextLine();
            text = scanner.nextLine();
            key = scanner.nextInt();
        } else {
            Map<String, String> commandLineArgs = new HashMap<>();
            for (int i = 0; i < args.length - 1; i += 2) {
                commandLineArgs.put(args[i], args[i + 1]);
            }
            encDec = commandLineArgs.getOrDefault("-mode", "enc");
            text = commandLineArgs.getOrDefault("-data", "");
            key = Integer.parseInt(commandLineArgs.getOrDefault("-key", "0"));
        }
        System.out.println(encryptDecrypt(encDec, text, key));
    }



    public static String encryptDecrypt(String encDec, String text, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (encDec.equals("enc")) {
                stringBuilder.append((char)  (text.charAt(i) + key));
            } else {
                stringBuilder.append((char)  (text.charAt(i) - key));
            }

        }
        return stringBuilder.toString();
    }

    public static void stage1Implementation() {
        String message = "we found a treasure!";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i))) {
                stringBuilder.append((char) (122 - message.charAt(i) + 97));
            } else {
                stringBuilder.append(message.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}