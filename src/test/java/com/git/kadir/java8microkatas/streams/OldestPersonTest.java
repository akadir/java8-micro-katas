package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author akadir
 * Date: 07/02/2019
 * Time: 22:29
 */
public class OldestPersonTest {
    private Person sara = new Person("Sara", 4);
    private Person viktor = new Person("Viktor", 40);
    private Person eva = new Person("Eva", 42);
    private List<Person> collection = Arrays.asList(sara, eva, viktor);

    @Test
    public void testGetOldestPerson() {
        Assertions.assertThat(OldestPerson.getOldestPerson(collection)).isEqualsToByComparingFields(eva);
    }

    @Test
    public void testGetOldestPerson7() {
        Assertions.assertThat(OldestPerson.getOldestPerson7(collection)).isEqualsToByComparingFields(eva);
    }
}