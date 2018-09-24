package me.sureshraman.singtelcodechallenge.model;

import me.sureshraman.singtelcodechallenge.constant.I18nKey;

public class Rooster extends Animal implements Sayer, Walker {
    public String say() {
        return I18nKey.SAY_ROOSTER;
    }
}
