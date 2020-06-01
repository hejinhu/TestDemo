package com.test.IO;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOExcelRead {

    public static void main(String[] args) throws IOException {
        POIFSFileSystem  fs =new POIFSFileSystem( new FileInputStream("F:/a.xlsx"));

        XSSFWorkbook workbook=new XSSFWorkbook(fs);

        XSSFSheet sheet = workbook.getSheetAt(0);

        XSSFRow row = sheet.getRow(3);

        XSSFCell cell = row.getCell(3);

        System.out.println(cell);


        fs.close();


    }
}
