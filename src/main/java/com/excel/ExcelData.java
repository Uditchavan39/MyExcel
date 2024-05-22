package com.excel;

import java.util.ArrayList;
import java.util.List;

public class ExcelData {
    private static List<List<String>> data;

    ExcelData() {
        ExcelData.data = new ArrayList<>();
    }

    public static List<List<String>> getData() {
        return data;
    }

    public static void setData(List<List<String>> data) {
        ExcelData.data = data;
    }

    public static void printData() {
        String temp="";
        for(int i=0;i<data.size();i++){
            temp+=data.get(i);
            temp+="\n";
        }
        System.out.println("data :: \n"+temp);
    }
    
}
