package main.utils;

import java.util.Scanner;

public class ConsoleInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readNextLine() {
        return scanner.nextLine();
    }
}
