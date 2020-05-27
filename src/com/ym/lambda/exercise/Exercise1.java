package com.ym.lambda.exercise;

import com.ym.lambda.data.Person;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Exercise1
 * @Description TODO
 * @createTime 2020-05-27 23:26:00
 */
public class Exercise1 {

    public static void main(String[] args) {
        //ArrayList中有若干Person对象，按照年龄降序排序
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Eric",23));
        list.add(new Person("Lily",42));
        list.add(new Person("Lucy",32));
        list.add(new Person("Monkey",11));
        list.sort((p1,p2)->p1.getAge() - p2.getAge());
        for (Person p : list){
            System.out.println(p.toString());
        }
    }
}
