package me.sureshraman.singtelcodechallenge;

import me.sureshraman.singtelcodechallenge.model.Bird;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.walk());
        System.out.println(bird.fly());
//        bird.sing();
    }
}
