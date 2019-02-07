package com.git.kadir.java8microkatas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 22:06
 */
public class FilterCollection {
    public static List<String> transform(List<String> collection) {
        return collection.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

    public static List<String> transform7(List<String> collection) {
        List<String> result = new ArrayList<>();
        for (String s : collection) {
            if (s.length() < 4) {
                result.add(s);
            }
        }
        return result;
    }
}
