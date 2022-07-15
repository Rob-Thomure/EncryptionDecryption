public class DecryptionUnicode extends Cypher{

    public DecryptionUnicode(String text, int key) {
        super(text, key);
    }

    @Override
    char convertChar(char character) {
        return  (char) (character - getKey());
    }
}
