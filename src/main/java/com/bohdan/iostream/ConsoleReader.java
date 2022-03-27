package com.bohdan.iostream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {

    Scanner scanner = new Scanner(System.in);

    public List<String> read() {

        List<String> consoleText = new ArrayList<>();

        System.out.println("Write something and push enter!");

        while (true) {
            String newLine = scanner.nextLine();
            if (newLine.isBlank()) {
                break;
            }
            consoleText.add(newLine);
        }
        return consoleText;
    }
}
