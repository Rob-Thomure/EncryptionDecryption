public abstract class Cypher {
    private final String text;
    private final int key;

    Cypher(String text, int key) {
        this.text = text;
        this.key = key;
    }

    abstract char convertChar(char character);

    String convertText() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            stringBuilder.append(convertChar(text.charAt(i)));
        }
        return stringBuilder.toString();
    }

    public int getKey() {
        return key;
    }
}
