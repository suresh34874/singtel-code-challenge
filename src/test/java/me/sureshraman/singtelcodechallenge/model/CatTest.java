package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CatTest {
    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat();
    }

    @Test
    public void shouldSayMeow() {
        String sayResult = cat.say();

        assertThat(sayResult).isEqualTo("Meow");
    }

    @Test
    public void shouldWalk() {
        String walkResult = cat.walk();

        assertThat(walkResult).isEqualTo("I am walking");
    }
}
