package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DolphinTest {
    private Dolphin dolphin;

    @Before
    public void setUp() {
        dolphin = new Dolphin();
    }

    @Test
    public void shouldSwim() {
        String swimResult = dolphin.swim();

        assertThat(swimResult).isEqualTo("I am swimming");
    }
}
