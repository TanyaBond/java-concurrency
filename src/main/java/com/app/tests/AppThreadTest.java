package com.app.tests;

import com.app.runnable.AppThread;

public class AppThreadTest {

    public static void main(String[] args) {
        AppThread thread1 = new AppThread();
        AppThread thread2 = new AppThread();
        AppThread thread3 = new AppThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }


}
