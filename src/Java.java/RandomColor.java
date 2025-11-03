import java.util.Random;
//import package.lights.lightcontrol;

public int RandomBrightnessGenerator;
public int RandomColorGenerator;

public class RandomColorGenerator {
        Random random = new Random();
        public int randomColorNumber () {
                return random.nextInt(4) + 1; 
        }
    }

public class RandomBrightnessGenerator {
        Random random = new Random();
        public int randomBrightnessNumber () {
                return random.nextInt(2) + 1; 
        }
    }

public static void main(String[] args) () {
        randomColorNumber = new RandomColorGenerator();
        randomNumber = generator.RandomColor();
        RandomBrightnessGenerator = new RandomColorGenerator();
        RandomBrightness = generator.RandomBrightness();
        while (true) {
                while (true) {
                        if (randomColorNumber == 1) {
                        System.out.println ("System.setcolor (255, 0, 0);");
                        } else if (randomColorNumber == 2) {
                        System.out.println ("System.setcolor (255, 90, 0);");
                        } else if (randomColorNumber == 3) {
                        System.out.println ("System.setcolor (255, 232, 8);");
                        } else {
                        System.out.println ("System.setcolor (170, 66, 3);");
                        }
                        delay (500)
                }
                while (true) {
                if (randomBrightnessNumber == 1) {
                                System.out.println ("System.setbrightness (255);")                 
                        } else {
                                System.out.println ("System.setbrightness (190)")
                        }
                        delay (25);
                }
        }
