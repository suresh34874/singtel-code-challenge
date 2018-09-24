package me.sureshraman.singtelcodechallenge.service;

import me.sureshraman.singtelcodechallenge.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class AnimalCounterTest {

    private AnimalCounter animalCounter;

    @Before
    public void setUp() {
        animalCounter = new AnimalCounter();
    }

    @Test
    public void shouldReturnCountOfAnimalsCorrespondingToEachAction() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        Map<Action, Long> actionIntegerMap = animalCounter.countOfAnimalsPerAction(asList(animals));

        assertThat(actionIntegerMap).containsEntry(Action.FLY, 2L);
        assertThat(actionIntegerMap).containsEntry(Action.WALK, 7L);
        assertThat(actionIntegerMap).containsEntry(Action.SING, 1L);
        assertThat(actionIntegerMap).containsEntry(Action.SWIM, 4L);
    }
}