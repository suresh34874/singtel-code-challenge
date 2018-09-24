package me.sureshraman.singtelcodechallenge.model;

import me.sureshraman.singtelcodechallenge.constant.I18nKey;
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

        assertThat(sayResult).isEqualTo(I18nKey.SAY_ROOSTER);
    }

    @Test
    public void shouldWalk() {
        String walkResult = rooster.walk();

        assertThat(walkResult).isEqualTo("I am walking");
    }
}
