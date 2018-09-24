package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoosterTest {

    private Rooster rooster;

    @Before
    public void setUp() {
        rooster = new Rooster();
    }

    @Test
    public void shouldSayCockADoodleDoo() {
        String sayResult = rooster.say();

        assertThat(sayResult).isEqualTo("Cock-a-doodle-doo");
    }
}
