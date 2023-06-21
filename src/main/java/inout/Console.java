package inout;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    @SneakyThrows
    public void printEcho() {
        System.out.println("I'm your echo!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String echo = reader.readLine();
        System.out.println(echo);
    }

    public String saveUserInput() {
        System.out.println("I will save your input!");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int getIntegerFromUser() {
        System.out.println("Type integer!");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public double getDoubleFromUser() {
        System.out.println("Type double!");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
