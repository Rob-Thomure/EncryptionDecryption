
public class Main {
    public static void main(String[] args) {
        CommandLineInput commandLineInput = new CommandLineInput(args);
        if (commandLineInput.isValidInput()) {
            EncryptionDecryption encryptionDecryption = new EncryptionDecryption(commandLineInput.getMode(),
                    commandLineInput.getData(), commandLineInput.getKey());
            Output output = new Output(commandLineInput.getOut(), encryptionDecryption.getConvertedText());
            output.print();
        }
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