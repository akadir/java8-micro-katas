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
 * Time: 11:57
 */
public class GroupingTest {
    private Person sara = new Person("Sara", 4, "Norwegian");
    private Person viktor = new Person("Viktor", 40, "Serbian");
    private Person eva = new Person("Eva", 42, "Norwegian");
    private List<Person> collection = Arrays.asList(sara, eva, viktor);
    private List<Person> expectedNorwegian = Arrays.asList(sara, eva);
    private List<Person> expectedSerbian = Arrays.asList(viktor);

    @Test
    public void groupByNationality() {
        Map<String, List<Person>> result = Grouping.groupByNationality(collection);
        assertThat(result.get("Norwegian").size()).isEqualTo(expectedNorwegian.size());
        assertThat(result.get("Serbian").size()).isEqualTo(expectedSerbian.size());
        assertThat(result.get("Norwegian")).containsAll(expectedNorwegian);
        assertThat(result.get("Serbian")).containsAll(expectedSerbian);
    }

    @Test
    public void groupByNationality7() {
        Map<String, List<Person>> result = Grouping.groupByNationality7(collection);
        assertThat(result.get("Norwegian").size()).isEqualTo(expectedNorwegian.size());
        assertThat(result.get("Serbian").size()).isEqualTo(expectedSerbian.size());
        assertThat(result.get("Norwegian")).containsAll(expectedNorwegian);
        assertThat(result.get("Serbian")).containsAll(expectedSerbian);
    }
}