package com.excel.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class CSVLoader {

    public static boolean checkCSVCreateIfNotExist(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return true;
        } catch (Exception e) {
           File csvFile= new File("MyExcel.csv");
            try (FileWriter fileWriter = new FileWriter(csvFile)) {
                fileWriter.write("");
                fileWriter.close();
            }
            catch(Exception error){
                System.err.println("CSVLOADER :: "+error);
            }
           return true;
        }
    }
}
