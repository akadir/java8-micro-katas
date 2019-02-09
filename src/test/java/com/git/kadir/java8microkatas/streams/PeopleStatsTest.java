package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.git.kadir.java8microkatas.streams.PeopleStats.getStats;
import static com.git.kadir.java8microkatas.streams.PeopleStats.getStats7;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:29
 */
public class PeopleStatsTest {
    private Person sara = new Person("Sara", 4);
    private Person viktor = new Person("Viktor", 40);
    private Person eva = new Person("Eva", 42);
    private List<Person> collection = Arrays.asList(sara, eva, viktor);

    @Test
    public void getStatsShouldReturnAverageAge() {
        assertThat(getStats(collection).getAverage())
                .isEqualTo((double) (4 + 40 + 42) / 3);
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        assertThat(getStats(collection).getCount())
                .isEqualTo(3);
    }

    @Test
    public void getStatsShouldReturnMaximumAge() {
        assertThat(getStats(collection).getMax())
                .isEqualTo(42);
    }

    @Test
    public void getStatsShouldReturnMinimumAge() {
        assertThat(getStats(collection).getMin())
                .isEqualTo(4);
    }

    @Test
    public void getStatsShouldReturnSumOfAllAges() {
        assertThat(getStats(collection).getSum())
                .isEqualTo(40 + 42 + 4);
    }

    @Test
    public void getStatsShouldReturnAverageAge7() {
        assertThat(getStats7(collection).getAverage())
                .isEqualTo((double) (4 + 40 + 42) / 3);
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople7() {
        assertThat(getStats7(collection).getCount())
                .isEqualTo(3);
    }

    @Test
    public void getStatsShouldReturnMaximumAge7() {
        assertThat(getStats7(collection).getMax())
                .isEqualTo(42);
    }

    @Test
    public void getStatsShouldReturnMinimumAge7() {
        assertThat(getStats7(collection).getMin())
                .isEqualTo(4);
    }

    @Test
    public void getStatsShouldReturnSumOfAllAges7() {
        assertThat(getStats7(collection).getSum())
                .isEqualTo(40 + 42 + 4);
    }
}