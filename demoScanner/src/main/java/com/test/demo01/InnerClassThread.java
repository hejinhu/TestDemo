package com.test.demo01;

/*
* 匿名内部类，简化代码
*   把子类继承父类，重写父类的方法，创建子类对象合成一部完成
*   把实现类实现接口，重写接口中的方法，创建实现类对象合成一步
* 匿名内部类的最终产物：子类/实现类对象，而这个类没有名字
* */
public class InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new myThread().start
        new Thread(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+"这是Thread的一个线程");
                }
            }
        }.start();

        //线程的接口Runnable
        //Runnable r = new RunnableImpl();多态
        Runnable r = new Runnable(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+"这是runnable的线程");
                }
            }
        };
        new Thread(r).start();
    }
}
