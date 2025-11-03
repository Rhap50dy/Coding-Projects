import java.util.Random;

public class RandomNumberGenerator {
        Random random = new Random();
        public int randomNumber () {
                random.nextInt(4) + 1; 
        }
    }

public static void main() {
    RandomNumberGenerator = new RandomNumberGenerator(); 
    randomNumber = generator.random();
        if (randomNumber == 1) {
            System.out.println ("System.setcolor (255, 0, 0);");
        } else if (randomNumber == 2) {
            System.out.println ("System.setcolor (255, 90, 0);");
        } else if (randomNumber == 3) {
            System.out.println ("System.setcolor (255, 232, 8);");
        } else {
            System.out.println ("System.setcolor (170, 66, 3);");
        }
}
