package me.sureshraman.singtelcodechallenge.model;

public interface Swimmer {
    default String swim() {
        return "I am swimming";
    }
}
