import java.util.Scanner;

public class BodyMassIndex {
 public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   double weight, feet, inches;
   System.out.print("Enter Weight In Pounds: ");
   weight = sc.nextDouble();
   System.out.println("Enter Height");
   System.out.print("Feet: ");
   feet = sc.nextDouble();
   System.out.print("Inches: ");
   inches = sc.nextDouble();
     
   // Some Constants: 
   final double KILOGRAMS_PER_POUND = 0.45359237;
   final double METERS_PER_INCH = 0.0254;
   final double METERS_PER_FOOT = 0.3048;
   // Pounds to Kilo
   double weightInKilo = weight * KILOGRAMS_PER_POUND;
   double heightInMeters = (double)((inches * METERS_PER_INCH) + (feet * METERS_PER_FOOT));
   // NOW The BMI
   double bmi = weightInKilo / (heightInMeters * heightInMeters); 
   System.out.println("BMI Is "+bmi);
    if (bmi < 18.5) 
        System.out.println("Under-Weight");
    else if (bmi >= 18.5 && bmi < 25.0) 
        System.out.println("Normal");
    else if (bmi >= 25.0 && bmi < 30.0) 
         System.out.println("Over-Weight");
    else if (bmi >= 30.0)
         System.out.println("Obese");
    else
      System.out.println("MAZE KARO BHAI APP");
   }
}