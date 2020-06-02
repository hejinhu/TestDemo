package com.test.IO;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOExcelRead {

    public static void main(String[] args) throws IOException {
        //选择流以及文件路径
        InputStream  fs = new FileInputStream(new File("F:/a.xlsx"));

        //得到excel操作对象
        XSSFWorkbook workbook=new XSSFWorkbook(fs);

        //得到excel单页
        XSSFSheet sheet = workbook.getSheetAt(0);

        //得到单页之中的行
        XSSFRow row = sheet.getRow(3);

        //得到行中的某一格子
        XSSFCell cell = row.getCell(1);

        //打印结果
        System.out.println(cell);

        //关闭流
        fs.close();


    }
}
