package com.excel;

import java.io.IOException;

import com.excel.csv.CSVReader;
import com.excel.row.SortByRow;

import java.util.*;

public class MyExcel {
    static ArrayList<String> dummyRow = new ArrayList<>(Arrays.asList("value", "abc", "dvf", "34"));
    public static String filePath = "src\\main\\java\\com\\excel\\MyExcel.csv";
    static ArrayList<String> dummyCol = new ArrayList<>(
            Arrays.asList("This", "is", "new", "Column", "lost", "extra", "more"));

    public static void main(String[] args) throws IOException {

        ExcelData.setData(CSVReader.readFromCSV(filePath));
        SortByRow.sortByRow(0);
        ExcelData.printData();
    }
}