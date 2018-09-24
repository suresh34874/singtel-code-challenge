package me.sureshraman.singtelcodechallenge.service;

import me.sureshraman.singtelcodechallenge.model.Animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalCounter {

    public Map<Action, Long> countOfAnimalsPerAction(List<Animal> animals) {
        Map<Action, Long> animalsCountPerAction = new HashMap<>();
        for (Action action : Action.values()) {
            Long noOfAnimals = animals.stream().filter(action::canPerform).count();
            animalsCountPerAction.put(action, noOfAnimals);
        }
        return animalsCountPerAction;
    }
}
