package com.excel.column;

import com.excel.ExcelData;
import com.excel.MyExcel;
import com.excel.csv.CSVWriter;
import com.excel.row.Row;

import java.util.*;

public class Column {
    static List<List<String>> data;

    public static String addColumn(List<String> list) {
        data = ExcelData.getData();
        int i = 0;
        for (List<String> row : data) {
            if (i < data.size() && i < list.size())
                row.add(list.get(i));
            else {
                break;
            }
            i++;
        }
        if (i < list.size()) {
            while (i < list.size()) {
                Row.addRow(new ArrayList<>(Arrays.asList(list.get(i))));
                i++;
            }
        }

        ExcelData.setData(data);
        CSVWriter.writeToCSV(MyExcel.filePath, data);

        return "successfully Added Column.";
    }

    public static String deleteColumn(int index) {

        data = ExcelData.getData();
        for (List<String> row : data) {
            if (row.size() > index && index>=0) {
                row.remove(index);
            }
        }

        ExcelData.setData(data);
        CSVWriter.writeToCSV(MyExcel.filePath, data);
        return "successfully Deleted Column.";
    }

    public static String updateColumn(int index, List<String> list) {
        data = ExcelData.getData();
        if(index<0)
        return "Index out of bound";
        int i = 0;
        for (String str : list) {
            if (i < data.size()) {
                data.get(i).set(index, str);
            } else {
                List<String> row = new ArrayList<>();
                row.add(index, str);
                data.add(row);
            }
            i++;
        }

        ExcelData.setData(data);
        ExcelData.printData();
        CSVWriter.writeToCSV(MyExcel.filePath, data);

        return "successfully Updated Column.";

    }

}
