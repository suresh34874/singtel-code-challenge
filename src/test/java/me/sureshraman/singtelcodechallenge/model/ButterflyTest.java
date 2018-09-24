package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButterflyTest {
    private Butterfly butterfly;

    @Before
    public void setUp() {
        butterfly = new Butterfly();
    }

    @Test
    public void shouldFly() {
        String fly = butterfly.fly();

        assertThat(fly).isEqualTo("I am flying");
    }
}
