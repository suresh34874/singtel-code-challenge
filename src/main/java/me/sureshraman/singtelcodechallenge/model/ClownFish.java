package me.sureshraman.singtelcodechallenge.model;

public class ClownFish extends Fish {
    public Size size() {
        return Size.SMALL;
    }

    public Color color() {
        return Color.ORANGE;
    }

    public boolean isMakeJokes() {
        return true;
    }
}
