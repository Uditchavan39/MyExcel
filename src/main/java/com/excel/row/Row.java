package com.excel.row;

import com.excel.ExcelData;
import com.excel.MyExcel;
import com.excel.csv.CSVWriter;

import java.util.*;

public class Row {
    static List<List<String>> data;

    public static String addRow(List<String> list) {
        data = ExcelData.getData();
        data.add(list);
        ExcelData.setData(data);
        CSVWriter.writeToCSV(MyExcel.filePath, data);

        return "successfully Added Row.";
    }

    public static String deleteRow(int index) {

        data = ExcelData.getData();
        if (index >= data.size() || index<0)
            return "Index Out Of Bound.";
        data.remove(index);
        ExcelData.setData(data);
        CSVWriter.writeToCSV(MyExcel.filePath, data);
        return "successfully Deleted Row.";
    }

    public static String updateRow(List<String> list, int index) {

        data = ExcelData.getData();
        if (index >= data.size() || index<0)
            return "Index Out Of Bound.";
        data.remove(index);
        data.add(index, list);
        ExcelData.setData(data);
        CSVWriter.writeToCSV(MyExcel.filePath, data);

        return "successfully Updated Row.";

    }

}
