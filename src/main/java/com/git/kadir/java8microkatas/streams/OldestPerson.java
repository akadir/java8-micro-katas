package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;

import java.util.Comparator;
import java.util.List;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 22:26
 */
public class OldestPerson {

    public static Person getOldestPerson(List<Person> collection) {
        return collection.stream().max(Comparator.comparing(Person::getAge)).get();
    }

    public static Person getOldestPerson7(List<Person> collection) {
        int oldestAge = Integer.MIN_VALUE;
        Person oldestPerson = null;

        for (Person p : collection) {
            if (p.getAge() > oldestAge) {
                oldestAge = p.getAge();
                oldestPerson = p;
            }

        }

        return oldestPerson;
    }
}
