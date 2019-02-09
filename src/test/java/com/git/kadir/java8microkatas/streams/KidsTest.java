package com.git.kadir.java8microkatas.streams;

import com.git.kadir.java8microkatas.entity.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:17
 */
public class KidsTest {
    private Person sara = new Person("Sara", 4);
    private Person viktor = new Person("Viktor", 40);
    private Person eva = new Person("Eva", 42);
    private Person anna = new Person("Anna", 5);
    private List<Person> collection = Arrays.asList(sara, eva, viktor, anna);

    @Test
    public void getKidNames() {
        assertThat(Kids.getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }

    @Test
    public void getKidNames7() {
        assertThat(Kids.getKidNames7(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }
}