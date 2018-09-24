package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuckTest {

    private Duck duck;

    @Before
    public void setUp() {
        duck = new Duck();
    }

    @Test
    public void shouldSayQuackQuack() {
        String sayResult = duck.say();

        assertThat(sayResult).isEqualTo("Quack, quack");
    }

    @Test
    public void shouldSwim() {
        String swimResult = duck.swim();

        assertThat(swimResult).isEqualTo("I am swimming");
    }
}

