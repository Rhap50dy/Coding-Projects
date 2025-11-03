import java.util.Random;

bool true = true;

public class RandomColorGenerator {
        Random random = new RandomColor();
        public int randomColorNumber () {
                random.nextInt(4) + 1; 
        }
    }

public class RandomBrightnessGenerator {
        Random random = new RandomBrightness();
        public int randomBrightnessNumber () {
                random.nextInt(2) + 1; 
        }
    }

public static void main() {
        RandomNumberGenerator = new RandomNumberGenerator(); 
        randomNumber = generator.RandomColor();
        RandomBrightnessGenerator = new RandomColorGenerator();
        RandomBrightness = generator.RandomBrightness();
        while (true == true) {
                 if (randomColorNumber == 1) {
                    System.out.println ("System.setcolor (255, 0, 0);");
                } else if (randomColorNumber == 2) {
                    System.out.println ("System.setcolor (255, 90, 0);");
                } else if (randomColorNumber == 3) {
                    System.out.println ("System.setcolor (255, 232, 8);");
                } else {
                    System.out.println ("System.setcolor (170, 66, 3);");
                }
                if (randomBrightnessNumber == 1) {
                        System.out.println ("System.setbrightness (255);")                 
                } else {
                        System.out.println ("System.setbrightness (190)")
                }
                delay (25);
                
        }
}
