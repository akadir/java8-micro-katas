package com.git.kadir.java8microkatas.entity;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 22:28
 */
public class Person {
    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }
}
