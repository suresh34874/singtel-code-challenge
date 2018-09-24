package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChickenTest {

    private Chicken chicken;

    @Before
    public void setUp() {
        chicken = new Chicken();
    }

    @Test
    public void shouldSayCluckCluck() {
        String sayResult = chicken.say();

        assertThat(sayResult).isEqualTo("Cluck, cluck");
    }
}
