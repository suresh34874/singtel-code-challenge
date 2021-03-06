package me.sureshraman.singtelcodechallenge.model;

import me.sureshraman.singtelcodechallenge.constant.I18nKey;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParrotTest {

    private Parrot parrot;

    @Test
    public void shouldSayWoofWoofWhenLivingWithDogs() {
        parrot = new Parrot(new Dog());

        String sayResult = parrot.say();

        assertThat(sayResult).isEqualTo("Woof, woof");
    }

    @Test
    public void shouldSayMeowWhenLivingWithCats() {
        parrot = new Parrot(new Cat());

        String sayResult = parrot.say();

        assertThat(sayResult).isEqualTo("Meow");
    }

    @Test
    public void shouldSayCockADoodleDooWhenLivingWithRooster() {
        parrot = new Parrot(new Rooster());

        String sayResult = parrot.say();

        assertThat(sayResult).isEqualTo(I18nKey.SAY_ROOSTER);
    }

    @Test
    public void shouldWalk() {
        parrot = new Parrot();

        String walkResult = parrot.walk();

        assertThat(walkResult).isEqualTo("I am walking");
    }


}
