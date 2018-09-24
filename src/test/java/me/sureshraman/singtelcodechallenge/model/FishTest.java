package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FishTest {
    private Fish fish;

    @Before
    public void setUp() {
        fish = new Fish();
    }

    @Test
    public void shouldSwim() {
        String swimResult = fish.swim();

        assertThat(swimResult).isEqualTo("I am swimming");
    }
}
