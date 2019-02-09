package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;
import com.git.kadir.java8microkatas.entity.Stats;

import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:24
 */
public class PeopleStats {
    public static IntSummaryStatistics getStats(List<Person> people) {
        return people.stream().mapToInt(Person::getAge).summaryStatistics();
    }

    public static Stats getStats7(List<Person> people) {
        long sum = 0;
        int min = people.get(0).getAge();
        int max = 0;
        for (Person person : people) {
            int age = person.getAge();
            sum += age;
            min = Math.min(min, age);
            max = Math.max(max, age);
        }
        return new Stats(people.size(), sum, min, max);
    }
}
