package com.test.IO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IOTest {
    public static void main(String[] args) throws IOException {


        Properties properties = new Properties();

        InputStream in = IOTest.class.getResourceAsStream("com/test/IO/properties.properties");

        properties.load(in);

        System.out.println("名称="+properties.getProperty("2"));

    }
}
