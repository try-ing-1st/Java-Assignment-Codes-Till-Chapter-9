import java.util.Scanner;
public class TestCalculator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int f = sc.nextInt();
        System.out.print("Enter second number:");
        int s = sc.nextInt();
        Calculator cal = new Calculator();
        cal.add(f, s);
        cal.sub(f, s);
        cal.mul(f, s);
        cal.div(f, s);
        sc.close();
    }
}