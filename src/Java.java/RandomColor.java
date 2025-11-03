import java.util.Random;

public class RandomNumberGenerator {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1; 

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

public static void main() {
    RandomNumberGenerator.staticMethod();
}
