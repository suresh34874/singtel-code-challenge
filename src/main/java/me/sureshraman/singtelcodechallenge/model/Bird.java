package me.sureshraman.singtelcodechallenge.model;

public class Bird extends Animal implements Walker {
    public String fly() {
        return "I am flying";
    }

    public String sing() {
        return "I am singing";
    }
}