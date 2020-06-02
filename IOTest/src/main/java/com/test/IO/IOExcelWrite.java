package com.test.IO;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class IOExcelWrite {
    public static void main(String[] args) throws Exception {
        //文件路径
        OutputStream os = new FileOutputStream(new File("F:/a.xlsx"));


//        HSSFWorkbook workbook = new HSSFWorkbook();//适合xls结尾的文件
        XSSFWorkbook workbook = new XSSFWorkbook();//适合xlsx结尾的文件

        //新建sheet页
        XSSFSheet sheet1 = workbook.createSheet("这是第一个sheet页");
        //新建行
        XSSFRow row = sheet1.createRow(3);
        row.createCell(3).setCellValue("我是谁");
        row.createCell(2).setCellValue(new Date());
        row.createCell(1).setCellValue("2020-05-05");

        //新建列
        XSSFSheet sheet2 = workbook.createSheet("这是第2个sheet页");
        XSSFRow row1 = sheet2.createRow(0);
        row1.createCell(3).setCellValue(123);


        //保存文件
        workbook.write(os);

        //关闭流
        os.close();


    }

}
