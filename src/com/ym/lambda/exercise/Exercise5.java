package com.ym.lambda.exercise;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Exercise5
 * @Description TODO
 * @createTime 2020-05-28 00:18:00
 */
public class Exercise5 {
    public static void main(String[] args) {
        //new Thread
        Thread t = new Thread(() -> {
            for (int i = 0;i < 100;i++){
                System.out.println(i);
            }
        });
        t.start();
    }
}
