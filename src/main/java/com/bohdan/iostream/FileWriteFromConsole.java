package com.bohdan.iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriteFromConsole {

    private FileWriter fileWriter;

    public FileWriteFromConsole(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
        } catch (IOException e) {
            System.out.println("Something wrong!");
        }
    }

    public void writeToFile(List<String> textFromConsole) {
        try {
            for (String s : textFromConsole) {
                fileWriter.append(s);
                fileWriter.append("\n");
            }
            fileWriter.flush(); // todo read diff between flush and close!
        } catch (Exception e) {
            System.out.println("Something wrong!");
        }
    }
}
