package me.sureshraman.singtelcodechallenge.model;

public class Shark extends Fish {
    public Size size() {
        return Size.LARGE;
    }

    public Color color() {
        return Color.GREY;
    }

    public boolean isEatOtherFish() {
        return true;
    }
}
