
public class EncryptionDecryption {
    private final String mode;
    private final String text;
    private final int key;

    public EncryptionDecryption(String mode, String text, int key) {
        this.mode = mode;
        this.text = text;
        this.key = key;
    }

    public String getConvertedText() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (this.mode.equals("enc")) {
                stringBuilder.append((char)  (text.charAt(i) + key));
            } else {
                stringBuilder.append((char)  (text.charAt(i) - key));
            }
        }
        return stringBuilder.toString();
    }
}
