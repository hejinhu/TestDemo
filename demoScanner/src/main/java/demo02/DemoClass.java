package demo02;

import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args) {
        System.out.println("请输入：");
        String sc = methodReturn().next();
        System.out.println("输入的是："+ sc);
    }


    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
