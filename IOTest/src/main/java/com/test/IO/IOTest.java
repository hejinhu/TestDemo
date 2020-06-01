package com.test.IO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IOTest {
    public static void main(String[] args) throws IOException {
        //实例化properties对象
        Properties properties = new Properties();

        //使用类加载器，“/”代表了工程的根目录，例如工程名叫做myproject，“/”代表了myproject
        InputStream is = IOTest.class.getResourceAsStream("/config/proper.properties");

        //把输入流in加载到properties中
        properties.load(is);

        //得到properties文件中，key对应的val
        System.out.println("名称=" + properties.getProperty("location"));

    }
}
