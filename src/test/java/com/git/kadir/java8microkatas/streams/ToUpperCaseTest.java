package com.git.kadir.java8microkatas.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 21:50
 */
public class ToUpperCaseTest {
    private List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
    private List<String> expected = Arrays.asList("MY", "NAME", "IS", "JOHN", "DOE");

    @Test
    public void testTransform() {
        List<String> result = ToUpperCase.transform(collection);
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void testTransform7() {
        List<String> result = ToUpperCase.transform7(collection);
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }
}