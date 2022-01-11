package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {
    @Test
    public void readingFromExcel() throws IOException {
        //workbook ->worksheet -> row -> cell
        //open excel workbook using XSSFworkbook class
        //pass filename in the constructor
        XSSFWorkbook workbook = new XSSFWorkbook("Employees.xlsx");

        // goto worksheets
        XSSFSheet worksheet = workbook.getSheet("Sayfa1");

        //print
        System.out.println(worksheet.getRow(1).getCell(0));
    }
}
