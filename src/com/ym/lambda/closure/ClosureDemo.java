package com.ym.lambda.closure;

import java.util.function.Supplier;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName ClosureDemo
 * @Description TODO
 * @createTime 2020-05-28 00:45:00
 */
public class ClosureDemo {
    public static void main(String[] args) {
        int n = getNumber().get();
        System.out.println(n);
    }

    private static Supplier<Integer> getNumber(){
        int num= 10;

        return ()->{
            return num;
        };
    }
}
