package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DogTest {
    private Dog dog;

    @Before
    public void setUp() {
        dog = new Dog();
    }

    @Test
    public void shouldSayWoofWoof() {
        String sayResult = dog.say();

        assertThat(sayResult).isEqualTo("Woof, woof");
    }

    @Test
    public void shouldWalk() {
        String walkResult = dog.walk();

        assertThat(walkResult).isEqualTo("I am walking");
    }
}
