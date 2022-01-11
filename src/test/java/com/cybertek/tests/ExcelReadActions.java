package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelReadActions {
    String filepath = "Employees.xlsx";

    @Test
    public void readExcelSheetData() throws IOException {
        //open the employees.xlsx using Apache POI
        XSSFWorkbook workbook = new XSSFWorkbook(filepath);

        //goto sheet
        XSSFSheet worksheet = workbook.getSheetAt(0);

        //print column names row 0 cells 0, 1, 2,
        System.out.println("COLUMN NAMES:");
        //System.out.println(worksheet.getRow(0).getCell(0));
        //loop through print all 3 columns
        for (int i = 0; i < 3; i++) {
            System.out.println(worksheet.getRow(0).getCell(i));

        }
        
        // dif way
        int rowsCount = worksheet.getPhysicalNumberOfRows();
        System.out.println("rowsCount = " + rowsCount);


        int usedRowsCount = worksheet.getLastRowNum();
        System.out.println("usedRowsCount = " + usedRowsCount);

        //print all first names
        for (int i = 0; i < 8; i++) {
            System.out.println(worksheet.getRow(i).getCell(0));

        }

        //loop find fahima
        //print her last name, job then exit loop

        for (int i = 0; i < 8; i++) {
            if(worksheet.getRow(i).getCell(0).toString().equals("Fahima")){
                System.out.println(worksheet.getRow(i).getCell(0) + " | " + worksheet.getRow(i).getCell(1) + " | " + worksheet.getRow(i).getCell(2));
                break;
            }

        }


    }
}
