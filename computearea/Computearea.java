
import java.util.Scanner;

public class Computearea{
  public static void main(String args[]){
  final double PI = 3.14; 
  Scanner sc = new Scanner(System.in);
  double r, area;
  System.out.print("Enter Radius: ");
  r = sc.nextDouble();
  area = PI * r * r;
  
  System.out.println("Area Of The Circle With Radius " +r+ " Is " +area);
  }
}