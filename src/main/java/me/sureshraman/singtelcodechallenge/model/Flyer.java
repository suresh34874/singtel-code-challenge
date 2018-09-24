package me.sureshraman.singtelcodechallenge.model;

public interface Flyer {
    default String fly() {
        return "I am flying";
    }
}
