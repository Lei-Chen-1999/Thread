package com.kuang.lesson1;

public class TestThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("thread:" + i);
        }
    }

    public static void main(String[] args) {
        TestThread2 testThread2 = new TestThread2();
        new Thread(testThread2).start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("main:" + i);
        }
    }
}
