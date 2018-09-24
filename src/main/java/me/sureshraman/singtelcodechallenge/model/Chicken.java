package me.sureshraman.singtelcodechallenge.model;

public class Chicken extends Animal implements Sayer, Walker {
    public String say() {
        return "Cluck, cluck";
    }
}
