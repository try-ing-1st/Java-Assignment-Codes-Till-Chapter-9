import java.util.Scanner;
public class SubtractionQuizLoop {
 public static void main(String[] args) {
// Starting Timer
   long starttime = System.currentTimeMillis();
// A String Which Contain All Answers & Question
   String allquestions = " ";
// Five Questions
  final int questions = 5;
// Counting Questions
  int count = 1;
  int correctAnswers = 0;
// Loop For Iteration
  while (count <= questions) {
// Scanner For Input
  Scanner sc = new Scanner(System.in);
// Generating Number
  int n1 = (int)(Math.random() * 10);
  int n2 = (int)(Math.random() * 10);
// Swaping Number To Not Getting Negative Result
  if (n1 < n2) {
   int temp = n1;
   n1 = n2;
   n2 = temp;
  }
// Actual Answer
  int answer = n1 - n2;
  int result;
  System.out.print(n1+" - "+n2+" = ");
  result = sc.nextInt();

// Now Matching Answer
  if (answer == result) {
  System.out.println("You Are Correct!");
  correctAnswers++;
  }
  else {
  System.out.println("It Was Easy Browny!");
  }
// Now Checking Wrong & Correct For Storing
  allquestions += "\n"+n1+ " - "+n2+" = "+answer+((result == answer)?" Correct":" Wrong");
     
// Incrementing Count
  count++;
    }
   System.out.println("--------------------------------");
// Showing Correct
   long endtime = System.currentTimeMillis();
   long testtime = endtime - starttime;
   System.out.println("Time You Took: "+(testtime / 1000)+ " Seconds"); 
   System.out.println("Correct Score Is: "+correctAnswers);
// Showing Results  
   System.out.println("--------------------------------");
   System.out.println(allquestions);
  }
}