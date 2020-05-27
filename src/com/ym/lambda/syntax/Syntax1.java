package com.ym.lambda.syntax;

import com.ym.lambda.interfaces.*;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Syntax1
 * @Description TODO
 * @createTime 2020-05-27 18:21:00
 */
public class Syntax1 {
    public static void main(String[] args) {

        LambdaNoneReturnNoneParameter lambda1 = () -> {
            System.out.println("hello world");
        };
        lambda1.test();

        LambdaNoneReturnSingleParameter lambda2 =
                (int a) -> {
                    System.out.println(a);
                };
        lambda2.test(10);

        LambdaNoneReturnMultipleParameter lambda3 =
                (int a,int b) -> {
                    System.out.println(a+b);
                };
        lambda3.test(10,20);

        LambdaSingleReturnNoneParameter lambda4 =
                () -> {
                    System.out.println("lambda4");
                    return 100;
                };
        int res = lambda4.test();
        System.out.println(res);

        LambdaSingleReturnSingleParameter lambda5 =
                (int a)-> {
                    return a*2;
                };
        int res2 = lambda5.test(10);
        System.out.println(res2);

        LambdaSingleReturnMultipleParameter lambda6 =
                (int a,int b) -> {
                    return a+b;
                };
        int res3 = lambda6.test(10,40);
        System.out.println(res3);
    }
}
