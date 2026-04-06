public class Sec1 {
 public static void main(String args[]) {
   final double PI = 3.145;
   Scanner sc = new Scanner(System.in);
   // Reads Radius
   System.out.print("Enter Radius: ");
   double radius = sc.nextDouble();
   // Reads Length
   System.out.print("Enter Length: ");
   double length = sc.nextDouble();
   // Computes Area & Volume
   double area = (radius * radius) * PI;

   double volume = area * length;




  }
}