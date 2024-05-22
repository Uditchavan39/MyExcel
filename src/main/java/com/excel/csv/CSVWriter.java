package com.excel.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    public static void writeToCSV(String filepath, List<List<String>> data) {
        try {
            FileWriter fileWriter = new FileWriter(filepath);

            for (List<String> row : data) {
                StringBuilder line = new StringBuilder();
                for (int i = 0; i < row.size(); i++) {
                    if (row.get(i)!= "" && row.get(i).charAt(0) == '"' && row.get(i).charAt(row.get(i).length() - 1) == '"')
                        line.append(row.get(i));
                    else {
                        line.append("\"");
                        line.append(row.get(i));
                        line.append("\"");
                    }
                    if (i != row.size() - 1) {
                        line.append(',');
                    }
                }
                line.append("\n");
                fileWriter.write(line.toString());
            }
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Failed To Write to CSV File.");
        }
    }
}
