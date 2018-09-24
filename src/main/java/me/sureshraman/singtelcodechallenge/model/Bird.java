package me.sureshraman.singtelcodechallenge.model;

public class Bird extends Animal implements Walker, Flyer {

    public String sing() {
        return "I am singing";
    }
}