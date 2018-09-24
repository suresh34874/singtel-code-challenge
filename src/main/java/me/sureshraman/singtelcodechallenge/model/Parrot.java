package me.sureshraman.singtelcodechallenge.model;

import java.util.Optional;

public class Parrot extends Animal implements Sayer, Walker {

    private final Sayer livingWith;

    Parrot() {
        this.livingWith = null;
    }

    Parrot(Sayer livingWith) {
        this.livingWith = livingWith;
    }

    @Override
    public String say() {
        return Optional.ofNullable(livingWith).map(Sayer::say).orElse(null);
    }
}
