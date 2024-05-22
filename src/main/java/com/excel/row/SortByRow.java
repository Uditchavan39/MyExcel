package com.excel.row;

import java.util.Collections;
import java.util.List;

import com.excel.ExcelData;

public class SortByRow {
    static List<List<String>> data;

    public static void sortByRow(int rowIndex) {
        data = ExcelData.getData();
        Collections.sort(data.get(rowIndex));
        ExcelData.setData(data);

    }

}