import java.util.Scanner;


public class Average{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   double a, b, c;
   System.out.print("Number 1: ");
   a = sc.nextDouble();
   System.out.print("Number 2: ");
   b = sc.nextDouble();
   System.out.print("Number 3: ");
   c = sc.nextDouble();

   double average = (a + b + c) / 3;

  System.out.println("Average of Given Number Is: "+average);

  sc.close();
  


  } 
}