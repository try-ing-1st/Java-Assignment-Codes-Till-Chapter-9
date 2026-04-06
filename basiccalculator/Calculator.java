public class Calculator {
    // int a;
    // int b;
     Calculator() {
    }
    public void add(int a, int b) {
        System.out.println("Addition: " +(a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " +(a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication: " +(a * b));
    }

    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " +(a / b));
        } else {
            System.out.println("Division by zero is not allowed."); 
        }
    }
    
}