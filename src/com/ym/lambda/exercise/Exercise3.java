package com.ym.lambda.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Exercise3
 * @Description TODO
 * @createTime 2020-05-27 23:48:00
 */
public class Exercise3 {
    public static void main(String[] args) {
        //forEach
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,0);

        //将集合中的每一个元素加入到accept方法中
//        list.forEach(System.out::println);

        //输出集合中所有偶数
        list.forEach((a)->{
            if (a%2 == 0){
                System.out.println(a);
            }
        });
    }
}
