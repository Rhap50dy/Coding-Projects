package com.fire;
import java.util.Random;

public class RandomColorGenerator {
    Random random = new Random();
    public int randomColorNumber() {
            return random.nextInt(4) + 1; 
    }
}
