package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CaterpillarTest {
    private Caterpillar caterpillar;

    @Before
    public void setUp() {
        caterpillar = new Caterpillar();
    }

    @Test
    public void shouldWalk() {
        String walk = caterpillar.walk();

        assertThat(walk).isEqualTo("I am walking");
    }

    @Test
    public void shouldFlyAfterMetamorphism() {
        String fly = caterpillar.metamorph().fly();

        assertThat(fly).isEqualTo("I am flying");
    }
}
