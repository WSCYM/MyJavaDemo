package com.ym.lambda.syntax;

import com.ym.lambda.data.Person;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Syntax4
 * @Description TODO
 * @createTime 2020-05-27 23:18:00
 */
public class Syntax4 {
    public static void main(String[] args) {

        PersonCreator creater = ()-> new Person();

        //构造方法的引用:
        PersonCreator creator1 = Person::new;
        creator1.getPerson();

        PersonCreator2 creator2 = Person::new;
        Person ym = creator2.getPerson("ym", 23);
    }
}

@FunctionalInterface
interface PersonCreator {
    Person getPerson();
}

@FunctionalInterface
interface PersonCreator2 {
    Person getPerson(String name,Integer age);
}