public class CurrentTime {
 public static void main(String args[]) {
  // Step 1. Milli Seconds From 1970

  long totalMilliSeconds = System.currentTimeMillis();

  // Step 2. Total Seconds

  long totalSeconds = totalMilliSeconds / 1000;

  // Step 3. Current Seconds

  long currentSeconds = totalSeconds % 60;

  // Step 4. Total Minutes

  long totalMinutes = totalSeconds / 60;

  // Step 5. Current Minutes

  long currentMinutes = totalMinutes % 60;

  // Step 6. Total Hours

  long totalHours = totalMinutes / 60;

  // Step 7. Current Hours

  long currentHours = totalHours % 24;

  System.out.println("Current Time Is "+currentHours+":"+currentMinutes+":"
   +currentSeconds+" GMT");
 
  }
}