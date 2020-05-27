package com.ym.lambda.closure;

import java.util.function.Consumer;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName ClosureDemo2
 * @Description TODO
 * @createTime 2020-05-28 00:50:00
 */
public class ClosureDemo2 {
    public static void main(String[] args) {
        int a = 10;
        Consumer<Integer> c = ele->{
            System.out.println(a);
        };
//        a++;
        //lambda闭包中引用的变量一定是final常量
        //编译时系统会自动增加final修饰符
        c.accept(a);
    }
}
