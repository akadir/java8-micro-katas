package com.git.kadir.java8microkatas.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 22:15
 */
public class FlatCollectionTest {
    private List<List<String>> collection = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));
    private List<String> expected = Arrays.asList("Viktor", "Farcic", "John", "Doe", "Third");

    @Test
    public void testTransform() {
        List<String> result = FlatCollection.transform(collection);
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void testTransform7() {
        List<String> result = FlatCollection.transform7(collection);
        Assert.assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i), result.get(i));
        }
    }
}