import java.util.Random;

public class RandomNumberGenerator {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1; 
    }

public static void main() {
    RandomNumberGenerator.staticMethod(); //should i make it return something here for the if statement? or should i have it return something in the method?
                if (randomNumber == 1) {
            System.out.println ("System.setcolor (255, 0, 0);");
        } else if (randomNumber == 2) {
            System.out.println ("System.setcolor (255, 90, 0);");
        } else if (randomNumber == 3) {
            System.out.println ("System.setcolor (255, 232, 8);");
        } else if (randomNumber == 4) {
            System.out.println ("System.setcolor (170, 66, 3);");
        }
}
