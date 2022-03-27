package com.bohdan.iostream;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        List<String> textFromConsole = consoleReader.read();

        String filePath = "src/main/resources/file1.txt";
        FileWriteFromConsole fileWriteFromConsole = new FileWriteFromConsole(filePath);
        fileWriteFromConsole.writeToFile(textFromConsole);
    }
}
