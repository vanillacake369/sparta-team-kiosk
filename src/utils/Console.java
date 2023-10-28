package utils;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readNextLine() {
        return scanner.nextLine();
    }
}
