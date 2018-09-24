package me.sureshraman.singtelcodechallenge.model;

public interface Walker {
    default String walk() {
        return "I am walking";
    }
}
