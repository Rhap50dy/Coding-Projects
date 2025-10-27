public class calculator {
    
    public static double add (double x, double y) {  // creating add method
        return x + y;
    }
    public static double subtract (double x, double y) { // creating subtract method
        return x - y;
    }
    public static double multiply (double x, double y) { // creating mutplication method
        return x * y;
    }
    public static double divide (double x, double y) { // creating devision method
        return x / y;
    }
    public static double square_root (double x) { // creating square root method
        return Math.sqrt(x);
    }
}
public void main() {
   System.out.println(calculator.add(1, 1)); // enter the desired method and your number(s) using: (calculator.your method here(number1, number2))
} 

