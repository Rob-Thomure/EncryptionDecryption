import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int key = scanner.nextInt();
        String encryptedText = encrypt(text, key);
        System.out.println(encryptedText);
    }

    public static String encrypt(String text, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (text.charAt(i) + key > 122) {
                    stringBuilder.append((char) ((text.charAt(i) + key) % 122 + 96));
                } else {
                    stringBuilder.append((char) (text.charAt(i) + key));
                }

            } else {
                stringBuilder.append(text.charAt(i));
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