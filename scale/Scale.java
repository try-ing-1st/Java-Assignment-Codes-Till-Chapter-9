import java.util.Scanner;


public class Scale {
 public static void main(String args[]) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Temperature In Fahrenheit: ");
  double fahrenheit = scan.nextDouble();
  
  double celsius = (5.0 / 9) * (fahrenheit - 32);

  System.out.println("Temperature In Celsius Is: "+celsius);
 


  }
}