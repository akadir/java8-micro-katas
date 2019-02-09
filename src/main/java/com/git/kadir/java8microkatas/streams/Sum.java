package com.git.kadir.java8microkatas.streams;

import java.util.List;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:06
 */
public class Sum {
    public static int calculate(List<Integer> collection) {
        return collection.stream().mapToInt(Integer::intValue).sum();
    }

    public static int anotherCalculate(List<Integer> collection) {
        return collection.stream().reduce(0, (total, number) -> total + number);
    }

    public static int calculate7(List<Integer> collection) {
        int sum = 0;
        for (int i : collection)
            sum += i;
        return sum;
    }
}
