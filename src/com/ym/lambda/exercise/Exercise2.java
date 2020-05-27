package com.ym.lambda.exercise;

import com.ym.lambda.data.Person;

import java.util.TreeSet;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Exercise2
 * @Description TODO
 * @createTime 2020-05-27 23:40:00
 */
public class Exercise2 {
    public static void main(String[] args) {
        //TreeSet
        //使用Lambda实现Comparator接口作为TreeSet构造器的参数
        TreeSet<Person> set = new TreeSet<>(
                (o1,o2)->{
                    if (o1.getAge()>=o2.getAge()){
                        return -1;
                    } else {
                        return 1;
                    }
                });
        set.add(new Person("Eric",23));
        set.add(new Person("Lily",42));
        set.add(new Person("Lucy",32));
        set.add(new Person("Monkey",11));
        set.add(new Person("Dog",11));
        System.out.println(set);
    }
}
