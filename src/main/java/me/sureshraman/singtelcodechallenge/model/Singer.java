package me.sureshraman.singtelcodechallenge.model;

public interface Singer {
    default String sing() {
        return "I am singing";
    }
}
