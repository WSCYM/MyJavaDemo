package com.ym.lambda.data;

/**
 * @author ym
 * @version 1.0.0
 * @ClassName Person
 * @Description TODO
 * @createTime 2020-05-27 23:15:00
 */
public class Person {
    private String name;
    private Integer age;

    public Person(){
        System.out.println("init Person");
    }

    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
        System.out.println("init Person with parameters");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
