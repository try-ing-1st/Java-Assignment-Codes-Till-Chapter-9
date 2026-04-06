import java.util.Scanner;

public class Time{
 public static void main(String[] args){
  Scanner t = new Scanner(System.in);
  int seconds, minutes, remseconds;
  System.out.print("Enter Seconds: ");
  seconds = t.nextInt();
  
  minutes = seconds / 60;
  remseconds = seconds % 60;

  System.out.println(seconds+ " Is "+minutes+" Minutes And "+remseconds+ " Seconds ");
 }
}