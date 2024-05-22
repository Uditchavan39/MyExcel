package com.excel.Cell;

import java.util.List;

import com.excel.ExcelData;
import com.excel.MyExcel;
import com.excel.csv.CSVWriter;

public class Cell {
    static List<List<String>> data;

    public static String modifyCell(int row, int col, String val) {
        data = ExcelData.getData();
        if (row < data.size()) {
            if (col < data.get(row).size()) {
                data.get(row).set(col, val);
                ExcelData.setData(data);
                CSVWriter.writeToCSV(MyExcel.filePath, data);
                return "Value Updated.";
            } else {
                return "Col out of Bound.";
            }

        } else {
            return "Row out of bound.";
        }
    }
}
