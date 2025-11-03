import java.util.Random;
//import package.lights.lightcontrol;

public class RandomColorGenerator {
        Random random = new Random();
        public int randomColorNumber() {
                return random.nextInt(4) + 1; 
        }
    }

public class RandomBrightnessGenerator {
        Random random = new Random();
        public int randomBrightnessNumber() {
                return random.nextInt(2) + 1; 
        }
    }
public class Main {
    public static void main(String[] args) () {
        RandomColorGenerator colorGenerator = new RandomColorGenerator();
        int randomNumber = colorGenerator.randomColorNumber();
        RandomBrightnessGenerator brightnessGenerator = new RandomBrightnessGenerator();
        int randomBrightness = brightnessGenerator.randomBrightnessNumber();
        int counter = 0;
        
        while(true) {
            if (counter == 20) {
                counter = 0;
                if(randomColorNumber == 1) {
                    System.out.println("System.setcolor(255, 0, 0);");
                } else if(randomColorNumber == 2) {
                    System.out.println("System.setcolor(255, 90, 0);");
                } else if(randomColorNumber == 3) {
                    System.out.println("System.setcolor(255, 232, 8);");
                } else {
                    System.out.println("System.setcolor(170, 66, 3);");
                }
            }

            if(randomBrightnessNumber == 1) {
                System.out.println("System.setbrightness(255);")                 
            } else {
                System.out.println("System.setbrightness(190)")
            }
            delay(25);
            counter ++;
        }
    }
        //Potential robot led code? just change the syntax a bit. 
}