package com.ym.lambda.exercise;

import com.ym.lambda.data.Person;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Exercise4
 * @Description TODO
 * @createTime 2020-05-28 00:10:00
 */
public class Exercise4 {
    //删除集合中满足条件的元素
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Eric", 23));
        list.add(new Person("Lily", 42));
        list.add(new Person("Lucy", 32));
        list.add(new Person("Monkey", 9));

        //删除集合中age大于10的Person
        list.removeIf(ele-> ele.getAge()>=10);
        System.out.println(list);
    }
}
