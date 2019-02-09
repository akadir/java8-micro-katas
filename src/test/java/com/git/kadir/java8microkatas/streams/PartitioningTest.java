package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:42
 */
public class PartitioningTest {
    private Person sara = new Person("Sara", 4);
    private Person viktor = new Person("Viktor", 40);
    private Person eva = new Person("Eva", 42);
    private List<Person> collection = Arrays.asList(sara, eva, viktor);
    private List<Person> expectedAdults = Arrays.asList(viktor, eva);
    private List<Person> expectedNotAdults = Arrays.asList(sara);

    @Test
    public void partitionAdults() {
        Map<Boolean, List<Person>> result = Partitioning.partitionAdults(collection);
        assertThat(result.get(true).size()).isEqualTo(expectedAdults.size());
        assertThat(result.get(false).size()).isEqualTo(expectedNotAdults.size());

        assertThat(result.get(true)).containsAll(expectedAdults);
        assertThat(result.get(false)).containsAll(expectedNotAdults);
    }

    @Test
    public void partitionAdults7() {
        Map<Boolean, List<Person>> result = Partitioning.partitionAdults7(collection);
        assertThat(result.get(true).size()).isEqualTo(expectedAdults.size());
        assertThat(result.get(false).size()).isEqualTo(expectedNotAdults.size());

        assertThat(result.get(true)).containsAll(expectedAdults);
        assertThat(result.get(false)).containsAll(expectedNotAdults);
    }
}