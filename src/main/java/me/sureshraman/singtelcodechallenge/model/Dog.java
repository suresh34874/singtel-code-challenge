package me.sureshraman.singtelcodechallenge.model;

public class Dog extends Animal implements Sayer, Walker {
    @Override
    public String say() {
        return "Woof, woof";
    }
}
