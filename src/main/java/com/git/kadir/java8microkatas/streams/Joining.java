package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 12:04
 */
public class Joining {
    public static String namesToString(List<Person> people) {
        return people.stream().map(Person::getName).collect(Collectors.joining(", ", "Names: ", "."));
    }

    public static String namesToString7(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }
}
