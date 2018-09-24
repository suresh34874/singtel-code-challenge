package me.sureshraman.singtelcodechallenge.model;

public class Cat extends Animal implements Sayer, Walker {
    @Override
    public String say() {
        return "Meow";
    }
}
