package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 12:05
 */
public class JoiningTest {
    private Person sara = new Person("Sara", 4);
    private Person viktor = new Person("Viktor", 40);
    private Person eva = new Person("Eva", 42);
    private List<Person> collection = Arrays.asList(sara, viktor, eva);
    private String expected = "Names: Sara, Viktor, Eva.";

    @Test
    public void namesToString() {
        assertThat(Joining.namesToString(collection)).isEqualTo(expected);
    }

    @Test
    public void namesToString7() {
        assertThat(Joining.namesToString7(collection)).isEqualTo(expected);
    }
}