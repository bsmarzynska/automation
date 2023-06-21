import inout.Console;
import inout.TextFiles;
import org.testng.annotations.Test;

public class Tests {

    @Test(description = "i/o test")
    public void test() {
        Console console = new Console();
        TextFiles text = new TextFiles();

        console.printEcho();
    }

}
