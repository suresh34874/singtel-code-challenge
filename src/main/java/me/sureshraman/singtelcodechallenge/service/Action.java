package me.sureshraman.singtelcodechallenge.service;

import me.sureshraman.singtelcodechallenge.model.*;

public enum Action {
    FLY {
        @Override
        boolean canPerform(Animal animal) {
            return animal instanceof Flyer;
        }
    },
    WALK {
        @Override
        boolean canPerform(Animal animal) {
            return animal instanceof Walker;
        }
    },
    SING {
        @Override
        boolean canPerform(Animal animal) {
            return animal instanceof Singer;
        }
    },
    SWIM {
        @Override
        boolean canPerform(Animal animal) {
            return animal instanceof Swimmer;
        }
    };

    abstract boolean canPerform(Animal animal);
}
