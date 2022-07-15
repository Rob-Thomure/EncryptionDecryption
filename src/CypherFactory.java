public abstract class CypherFactory {

    abstract Cypher createCypher(String mode, String algorithm, String text, int key);

    String convertText(String mode, String algorithm, String text, int key) {
        Cypher cypher = createCypher(mode, algorithm, text, key);
        return cypher.convertText();
    }
}
