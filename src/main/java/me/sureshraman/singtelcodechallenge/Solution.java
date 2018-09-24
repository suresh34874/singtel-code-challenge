package me.sureshraman.singtelcodechallenge;

import me.sureshraman.singtelcodechallenge.model.Bird;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
//        bird.sing();
    }
}
