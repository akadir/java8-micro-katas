package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:38
 */
public class Partitioning {
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream().collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
    }

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());

        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }

        return map;
    }
}
