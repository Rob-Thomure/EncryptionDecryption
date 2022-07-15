
public class Main {
    public static void main(String[] args) {
        CommandLineInput commandLineInput = new CommandLineInput(args);
        if (commandLineInput.isValidInput()) {
            CypherCreator cypherCreator = new CypherCreator();
            String cypheredText = cypherCreator.convertText(commandLineInput.getMode(), commandLineInput.getAlgorithm(),
                    commandLineInput.getData(), commandLineInput.getKey());
            Output output = new Output(commandLineInput.getOut(), cypheredText);
            output.print();
        }
    }
}