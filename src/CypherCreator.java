public class CypherCreator extends CypherFactory{

    @Override
    Cypher createCypher(String mode, String algorithm, String text, int key) {
        if ("enc".equals(mode)) {
            if ("unicode".equals(algorithm)) {
                return new EncryptionUnicode(text, key);
            }
            return new EncryptionShift(text, key);
        } else if ("dec".equals(mode)) {
            if ("unicode".equals(algorithm)) {
                return new DecryptionUnicode(text, key);
            }
            return new DecryptionShift(text, key);
        } else {
            if ("unicode".equals(algorithm)) {
                return new EncryptionUnicode(text, key);
            }
            return new EncryptionShift(text, key);
        }
    }
}
