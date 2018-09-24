package me.sureshraman.singtelcodechallenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SharkTest {
    private Shark shark;

    @Before
    public void setUp() {
        shark = new Shark();
    }

    @Test
    public void shouldBeLarge() {
        Size size = shark.size();

        assertThat(size).isEqualTo(Size.LARGE);
    }

    @Test
    public void shouldBeGrey() {
        Color color = shark.color();

        assertThat(color).isEqualTo(Color.GREY);
    }

    @Test
    public void shouldEatOtherFish() {
        boolean isEatOtherFish = shark.isEatOtherFish();

        assertThat(isEatOtherFish).isTrue();
    }

    @Test
    public void shouldSwim() {
        String swimResult = shark.swim();

        assertThat(swimResult).isEqualTo("I am swimming");
    }
}
