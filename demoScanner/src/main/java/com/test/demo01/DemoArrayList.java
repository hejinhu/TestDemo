package com.test.demo01;

import java.util.ArrayList;

/*
数组的长度不可以改变
但是ArrayList可以随意改变

对于ArrayList而言，有一个<E>是表示泛型
泛型：装在集合中的所有元素都是统一的类型
注意：泛型只能是引用类型，不能是基本类型【可以使用基本类型的包装类进行使用】
 */
public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小金刚");
        System.out.println(list);
        list.add("结算通卡");
        list.add("红衣大炮");
        list.add("益达口香糖");
        list.add("企业网银");
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.size());

        System.out.println("asdfgh".indexOf("a"));

        

    }

}
