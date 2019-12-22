package com.zhengjiawei.cn;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: MrZheng
 * @Date: 2019/12/21 10:42
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        VolatitleThread volatitleThread = new VolatitleThread();
        for (int i = 0; i < 2; i++) {
            new Thread(volatitleThread).start();
        }
    }
}

class VolatitleThread implements Runnable{

    public static  AtomicInteger sum = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sum.addAndGet(1);
            System.out.println(sum);
        }
    }
}
