package inout;

import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFiles {

    @SneakyThrows
    public void writeStringToFile(String text) {
        BufferedWriter writer = new BufferedWriter(new FileWriter("testFile.txt"));
        writer.write(text);
        writer.close();
    }

    @SneakyThrows
    public String saveFirstLineFromFile(String path) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        System.out.println(line);
        reader.close();
        return line;
    }

    @SneakyThrows
    public List<String> saveAllLinesFromFile(String path) {
        List<String> fileContent = new ArrayList<>();
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNext()) {
            fileContent.add(scanner.nextLine());
        }

        return fileContent;
    }
}
