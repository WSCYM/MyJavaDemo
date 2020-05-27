package com.ym.lambda.syntax;

import com.ym.lambda.interfaces.LambdaNoneReturnMultipleParameter;
import com.ym.lambda.interfaces.LambdaNoneReturnSingleParameter;
import com.ym.lambda.interfaces.LambdaSingleReturnMultipleParameter;
import com.ym.lambda.interfaces.LambdaSingleReturnNoneParameter;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Syntax2
 * @Description TODO
 * @createTime 2020-05-27 19:51:00
 */
public class Syntax2 {

    //可对参数精简

    //1.类型
    //如果需要省略类型，则每一个参数的类型都要省略
    LambdaNoneReturnMultipleParameter lambda1 =
            (a, b) -> {
                System.out.println("hello world");
            };

    //2.参数小括号
    //如果参数列表中，参数的数量只有一个，则小括号可以省略
    LambdaNoneReturnSingleParameter lambda2 =
            a -> {
                System.out.println("hello world");
            };

    //3.方法大括号
    //若方法体只有一条语句，则大括号可省
    LambdaNoneReturnSingleParameter lambda3 =
            a -> System.out.println("hello world");

    //4.若方法体中唯一一条语句是一个返回语句，则在省略掉大括号的同时，也必须省略掉return
    LambdaSingleReturnNoneParameter lambda4 = ()->18;
    LambdaSingleReturnMultipleParameter lambda5 =
            (a,b)-> a+b;
}

