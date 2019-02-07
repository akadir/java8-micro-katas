package com.git.kadir.java8microkatas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 21:49
 */
public class ToUpperCase {

    public static List<String> transform(List<String> collection) {
        return collection.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static List<String> transform7(List<String> collection) {
        List<String> result = new ArrayList<>();
        for (String s : collection) {
            result.add(s.toUpperCase());
        }
        return result;
    }
}
