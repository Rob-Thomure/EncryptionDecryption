public class EncryptionShift extends Cypher{

    EncryptionShift(String text, int key) {
        super(text, key);
    }

    @Override
    char convertChar(char character) {
        if (Character.isLetter(character)) {
            if (character >= 97) {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + getKey()) % 26;
                return (char) ('a' + newAlphabetPosition);
            } else {
                int originalAlphabetPosition = character - 'A';
                int newAlphabetPosition = (originalAlphabetPosition + getKey()) % 26;
                return (char) ('A' + newAlphabetPosition);
            }
        }
        else {
            return character;
        }
    }
}
