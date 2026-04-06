
public class TestStock {
 public static void main(String[] args) {
   Stock st1 = new Stock("ORCL", "Oracle Corporation");
   st1.setPreviousClosingPrice(34.5);
   st1.setCurrentPrice(34.35);
   System.out.printf("Percentage Change: %.2f%%\n", st1.getChangePercent());
   if (st1.getChangePercent() < 0)
     System.out.println("Price Is Decreasing!");
   else
     System.out.println("Price Is Increasing!");
  }
}