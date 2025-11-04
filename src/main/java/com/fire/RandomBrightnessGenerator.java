package com.fire;
import java.util.Random;


public class RandomBrightnessGenerator {
    Random random = new Random();
    public int randomBrightnessNumber() {
            return random.nextInt(2) + 1; 
    }
}