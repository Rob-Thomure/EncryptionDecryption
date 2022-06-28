
public class Main {
    public static void main(String[] args) {
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