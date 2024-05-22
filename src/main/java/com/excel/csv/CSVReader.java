package com.excel.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
            public static List<List<String>> readFromCSV(String filePath) {
        List<List<String>> data = new ArrayList<>();
        if (CSVLoader.checkCSVCreateIfNotExist(filePath)) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    List<String> row = Arrays.asList(line.split(","));
                    data.add(new ArrayList<>(row));
                }
            } catch (IOException e) {
                System.err.println("CSVREADER :: "+e);
            }

        }
        return data;
    }
}
