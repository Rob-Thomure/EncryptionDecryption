public class EncryptionUnicode extends Cypher{

    public EncryptionUnicode(String text, int key) {
        super(text, key);
    }

    @Override
    char convertChar(char character) {
        return (char) (character + getKey());
    }
}
