package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BirdTest {

    private Bird bird;

    @Before
    public void setUp() {
        bird = new Bird();
    }

    @Test
    public void shouldFly() {
        String flyResult = bird.fly();

        assertThat(flyResult).isEqualTo("I am flying");
    }
}