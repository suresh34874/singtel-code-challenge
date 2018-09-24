package me.sureshraman.singtelcodechallenge.model;

public class Duck extends Animal implements Sayer, Walker {
    public String say() {
        return "Quack, quack";
    }

    public String swim() {
        return "I am swimming";
    }
}
