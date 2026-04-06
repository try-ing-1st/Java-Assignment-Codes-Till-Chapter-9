import java.util.Scanner;
//import java.api.Math;

public class Power{
 public static void main(String[] args){
   Scanner p = new Scanner(System.in);
   int a, b;
   System.out.print("Enter a: ");
   a = p.nextInt();
   System.out.print("Enter b: ");
   b = p.nextInt();
   System.out.println("Power a^b Is: "+Math.pow(a, b));
  }
}