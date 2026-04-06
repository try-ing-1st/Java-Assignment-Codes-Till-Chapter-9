import java.util.Scanner;

public class FutureDates {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
  String day;
  String futureDay;
   // Inputting Today
   System.out.print("Enter Today's Day (0-6): ");
   int toDay = sc.nextInt();
  //  switch (toDay) {
  //    case 0: day = days[0]; break;
  //    case 1: day = days[1]; break;
  //    case 2: day = days[2]; break;
  //    case 3: day = days[3]; break;
  //    case 4: day = days[4]; break;
  //    case 5: day = days[5]; break;
  //    case 6: day = days[6]; break;
  //    default: { 
  //           day = "Unknown"; 
  //           System.out.println("Invalid Input! "+day);
  //           System.exit(0);
  //         }
  //   }
   // Elapsed Day Input
   System.out.print("Enter NO. Of Days Elapsed: ");
   int elapsedDays = sc.nextInt();
   // Implementing Formula What a Formula Is that
   // Mine Was remDays = elapsedDays % 7 then I Forward It
   int willDay = (toDay + elapsedDays) % 7;
  //  switch (willDay) {
  //    case 0: futureDay = days[0]; break;
  //    case 1: futureDay = days[1]; break;
  //    case 2: futureDay = days[2]; break;
  //    case 3: futureDay = days[3]; break;
  //    case 4: futureDay = days[4]; break;
  //    case 5: futureDay = days[5]; break;
  //    case 6: futureDay = days[6]; break;
  //    default: futureDay = "Unknown";
  //           System.out.println("Something Went Wrong! "+futureDay);
  //           break;
  //  }
 System.out.println("Today Is "+days[toDay]+" And Future Day Will Be "+
  days[willDay]+" InShah-Allah & Ramzaan Mubarik");
 
  }
}