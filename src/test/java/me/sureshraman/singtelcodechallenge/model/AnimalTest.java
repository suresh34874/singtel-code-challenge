package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalTest {

    private Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void shouldWalk() {
        String walkResult = animal.walk();

        assertThat(walkResult).isEqualTo("I am walking");
    }
}