package com.test.demo01;

import java.util.ArrayList;
import java.util.Collections;

public class doudizhu {
    public static void main(String[] args) {
        //  1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个数组存放花色，一个数组存放牌的序号
        String[] colors = {"♥","♣","♦","♠"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王放进集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历数组，组装54张牌
        for (String number : numbers) {
            for (String color : colors) {
                //System.out.println(color+number);
                //将组装好的牌放进poker数组
                poker.add(color+number);
            }
        }
        //System.out.println(poker);

        //  2.洗牌
        //使用集合工具类collections中的方法
        //static void shuffle(list<?> list) 使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
        //System.out.println(poker);

        //  3.发牌
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //遍历poker集合，获取每一张牌，使用poker集合的索引%3给三位玩家轮流发牌
        //剩余三张留作底牌
        //注意：先判断（i>=51）否则牌就发完了
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            if(i>=51){
                //给底牌发牌
                dipai.add(p);
            }else if (i%3==0){
                //给玩家1发牌
                player01.add(p);
            }else if (i%3==1){
                //给玩家2发牌
                player02.add(p);
            }else if (i%3==2){
                //给玩家3发牌
                player03.add(p);
            }
        }

        //  4.看牌
        System.out.println("玩家1的手牌："+player01);
        System.out.println("玩家2的手牌："+player02);
        System.out.println("玩家3的手牌："+player03);
        System.out.println("底牌为："+dipai);


    }
}
