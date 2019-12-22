package com.zhengjiawei.cn;

/**
 * @Auther: MrZheng
 * @Date: 2019/12/22 16:27
 * @Description:
 */
public class ConsumerOneinstance {

    public static void main(String[] args) {
        C c = new C();
        new Thread(c,"线程一").start();
        new Thread(c,"线程二").start();
    }
}


class C implements Runnable{

    public volatile int sum = 10;

    @Override
    public void run() {

            while (sum > 0) {
                synchronized (this) {
                    sum--;
                    System.out.println(Thread.currentThread().getName() + ": " + sum);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
