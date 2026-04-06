import java.util.Scanner;

public class SortedNumbers {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double a, b, c;
   System.out.print("a: ");
   a = sc.nextDouble();
   System.out.print("b: ");
   b = sc.nextDouble();
   System.out.print("c: ");
   c = sc.nextDouble();
   // Function
   displaySortedNumbers(a, b, c);
  }

// Function For Sorting
  public static void displaySortedNumbers(double num1, double num2, double num3) {
     double maximum = max(max(num1, num2), num3);
     double minimum = min(min(num1, num2), num3);
     double middle = (num1 + num2 + num3) - (maximum + minimum);
     System.out.printf("Increasing Order Of Numbers In (Floating Point): %f %f %f\n", minimum, middle, maximum);
     System.out.printf("Increasing Order Of Numbers In (Integer): %d %d %d\n", (int)(minimum), (int)middle, (int)maximum);  
   }
  public static double max(double x, double z) {
    return (x > z)? x : z; 
  }
  public static double min(double x, double z) {
    return (x < z)? x : z;
  }

}