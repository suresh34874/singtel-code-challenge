package me.sureshraman.singtelcodechallenge.model;

public class Caterpillar extends Animal implements Walker {
    public Butterfly metamorph() {
        return new Butterfly();
    }
}
