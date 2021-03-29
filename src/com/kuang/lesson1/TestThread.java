package com.kuang.lesson1;

public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("thread:" + i);
        }
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("main:" + i);
        }
    }
}
