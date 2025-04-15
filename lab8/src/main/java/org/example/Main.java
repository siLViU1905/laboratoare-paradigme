package org.example;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException, InvalidFormatException {
        File file = new File("TestExcel.xlsx");

        FileInputStream fileIn = null;

        try {
            fileIn = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFWorkbook workbookOut = new XSSFWorkbook();

        XSSFSheet sheet = workbook.getSheetAt(0);

        XSSFSheet sheetOut = workbookOut.createSheet("Sheet0");

        Map<String, Object[]> data = new TreeMap<String, Object[]>();

        Object[] objects = new Object[4];

        Iterator<Row> rowIterator = sheet.iterator();

        int i =0;
        int randuri = 0;
        String nume = "",prenume = "";
        double varsta = 0.0;
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext())
            {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                    case CellType.NUMERIC:
                        varsta = cell.getNumericCellValue();
                        System.out.print(varsta + " ");
                        break;
                    case CellType.STRING:
                        if(i%2 == 0)
                        {
                            prenume = cell.getStringCellValue();
                            System.out.print(prenume + " ");
                        }
                        else {
                            nume = cell.getStringCellValue();
                            System.out.print(nume + " ");
                        }
                        break;
                    case CellType.FORMULA:
                        System.out.print("Average: " + cell.getNumericCellValue());
                        break;
                }

            }
            System.out.println();

            Row randNou = sheetOut.createRow(randuri++);
            Cell celulaNoua = randNou.createCell(0);
            celulaNoua.setCellValue(prenume);
            celulaNoua = randNou.createCell(1);
            celulaNoua.setCellValue(nume);
            celulaNoua = randNou.createCell(2);
            celulaNoua.setCellValue(varsta + 10.0);
        }
        fileIn.close();

        FileOutputStream out = new FileOutputStream(new File("out.xlsx"));
       workbookOut.write(out);
       out.close();
    }


}