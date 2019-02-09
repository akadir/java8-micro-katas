package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:17
 */
public class Kids {
    public static Set<String> getKidNames(List<Person> collection) {
        return collection.stream().filter(person -> person.getAge() < 18).map(Person::getName).collect(Collectors.toSet());
    }

    public static Set<String> getKidNames7(List<Person> collection) {
        Set<String> names = new HashSet<>();
        for (Person person : collection)
            if (person.getAge() < 18)
                names.add(person.getName());
        return names;
    }
}
