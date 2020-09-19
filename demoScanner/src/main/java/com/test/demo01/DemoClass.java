package com.test.demo01;

import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person对象
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 29);
        Person three = new Person("蜘蛛侠", 33);

        array[0] = one;
        array[1] = two;
        array[2] = three;


        array[1].setName("超人");
        System.out.println(array[1].getName());








//        System.out.println("请输入：");
//        String sc = methodReturn().next();
//        System.out.println("输入的是："+ sc);
    }


    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
