import inout.Console;
import inout.TextFiles;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Console console = new Console();
        TextFiles text = new TextFiles();
        final String FILE_PATH = "src/main/resources/oneline.txt";

        console.printEcho();
        System.out.println(console.saveUserInput());
        try {

            System.out.println(console.getIntegerFromUser());
        } catch (InputMismatchException exception) {
            System.out.println("This is not integer");
        }
        System.out.println(console.getDoubleFromUser());

        text.writeStringToFile("My strings");
        List<String> lines = text.saveAllLinesFromFile("src/main/resources/manylines.txt");
        for (String line : lines) {
            System.out.println(line);
        }
        try {

            text.saveFirstLineFromFile(FILE_PATH);
        } catch (FileNotFoundException exception) {
            System.out.println("File " + FILE_PATH + " does not exist");
        }
    }
}
