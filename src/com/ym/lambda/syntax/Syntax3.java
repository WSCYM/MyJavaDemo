package com.ym.lambda.syntax;

import com.ym.lambda.interfaces.LambdaSingleReturnSingleParameter;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Syntax3
 * @Description TODO
 * @createTime 2020-05-27 22:14:00
 */
public class Syntax3 {
    public static void main(String[] args) {

        //方法引用
        //将一个lambda表达式的实现指向一个已经实现的方法
        //方法的隶属者::方法名

        LambdaSingleReturnSingleParameter lambda1 =
                a -> change(a);

        //引用了change方法的实现
        //tips:参数数量和类型一定要和接口中定义的方法一致
        //tips:返回值的类型一定要和接口中定义的方法一致
        LambdaSingleReturnSingleParameter lambda2 =
                Syntax3::change;
    }

    private static int change(int a) {
        return a * 2;
    }
}
