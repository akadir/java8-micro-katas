package com.git.kadir.java8microkatas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 22:15
 */
public class FlatCollection {
    public static List<String> transform(List<List<String>> collection) {
        return collection.stream().flatMap(v -> v.stream()).collect(Collectors.toList());
    }

    public static List<String> transform7(List<List<String>> collection) {
        List<String> result = new ArrayList<>();
        for (List<String> list : collection) {
            for (String s : list) {
                result.add(s);
            }
        }
        return result;
    }
}
