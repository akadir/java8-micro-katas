package com.git.kadir.java8microkatas.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 22:07
 */
public class FilterCollectionTest {
    private List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
    private List<String> expected = Arrays.asList("My", "is", "Doe");

    @Test
    public void testTransform() {
        List<String> result = FilterCollection.transform(collection);
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void testTransform7() {
        List<String> result = FilterCollection.transform7(collection);
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }
}