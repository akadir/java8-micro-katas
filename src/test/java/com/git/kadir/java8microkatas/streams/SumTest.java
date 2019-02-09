package com.git.kadir.java8microkatas.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:08
 */
public class SumTest {
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    private int result = 15;

    @Test
    public void calculate() {
        assertThat(Sum.calculate(numbers)).isEqualTo(result);
    }

    @Test
    public void calculateAnotherOption() {
        assertThat(Sum.anotherCalculate(numbers)).isEqualTo(result);
    }

    @Test
    public void calculate7() {
        assertThat(Sum.calculate7(numbers)).isEqualTo(result);
    }
}