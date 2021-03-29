package com.kuang.lesson1;

// 线程不安全，数据紊乱
public class TestThread4 implements Runnable {
    private static int stick = 100;

    @Override
    public void run() {
        while (stick > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出一张，还剩：" + --stick + " 张。");
        }
    }

    public static void main(String[] args) {
        TestThread4 thread4 = new TestThread4();
        new Thread(thread4,"X").start();
        new Thread(thread4,"二号机").start();
        new Thread(thread4,"黄牛").start();
    }
}
