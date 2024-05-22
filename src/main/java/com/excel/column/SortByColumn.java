package com.excel.column;

import java.util.List;

import com.excel.ExcelData;

public class SortByColumn {
static List<List<String>> data;

    public static void sortByColumn(int colIndex) {
        data = ExcelData.getData();
        for (List<String> list : data) {
            if(list.size()<=colIndex){
                System.err.println("Can't sort Index out of bound");
                return;
            }
        }
        data.sort((List<String> l1, List<String> l2) -> l1.get(colIndex).compareTo(l2.get(colIndex)));
        ExcelData.setData(data);

    }
}
