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

    @Test
    public void shouldSing() {
        String singResult = bird.sing();

        assertThat(singResult).isEqualTo("I am singing");
    }

    @Test
    public void shouldWalk() {
        String walkResult = bird.walk();

        assertThat(walkResult).isEqualTo("I am walking");
    }
}