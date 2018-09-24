package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClownFishTest {
    private ClownFish clownFish;

    @Before
    public void setUp() throws Exception {
        clownFish = new ClownFish();
    }

    @Test
    public void shouldBeSmall() {
        Size size = clownFish.size();

        assertThat(size).isEqualTo(Size.SMALL);
    }

    @Test
    public void shouldBeOrange() {
        Color color = clownFish.color();

        assertThat(color).isEqualTo(Color.ORANGE);
    }

    @Test
    public void shouldMakeJokes() {
        boolean isMakeJokes = clownFish.isMakeJokes();

        assertThat(isMakeJokes).isTrue();
    }

    @Test
    public void shouldSwim() {
        String swimResult = clownFish.swim();

        assertThat(swimResult).isEqualTo("I am swimming");
    }
}
