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
 * Time: 11:55
 */
public class Grouping {
    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getNationality));
    }

    public static Map<String, List<Person>> groupByNationality7(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }
}
