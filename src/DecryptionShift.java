public class DecryptionShift extends Cypher{

    DecryptionShift(String text, int key) {
        super(text, key);
    }

    @Override
    char convertChar(char character) {
        if (Character.isLetter(character)) {
            int newCharacter = character - getKey() % 26;
            if (character >= 97) {
                if (newCharacter < 97) {
                    newCharacter += 26;
                }
            } else {
                if (newCharacter < 65) {
                    newCharacter += 26;
                }
            }
            return (char) newCharacter;
        }
        else {
            return character;
        }
    }
}
