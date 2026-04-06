import java.util.Scanner;
public class TestAccount {
  public static void main(String[] args) {
   Account act1 = new Account(1122, 20000);
   act1.setInterestRate(4.5);
   act1.withdraw(2500);
   act1.deposit(3000);
   System.out.println(act1.getBalance());
   System.out.println(act1.getMonthlyInterest());
   System.out.println(act1.getDateCreated());
   System.out.println("==================");
   Account act2 = new Account();
   Scanner sc = new Scanner(System.in);
   int id;
   double balance, annualInterestRate;
   System.out.print("Enter Id: ");
   id = sc.nextInt();
   act2.setId(id);
   System.out.print("Enter Balance: ");
   balance = sc.nextDouble();
   act2.setBalance(balance);
   System.out.print("Enter Interest Rate Per Annual: ");
   annualInterestRate = sc.nextDouble();
   act2.setInterestRate(annualInterestRate);
   System.out.println("Id: "+act2.getId());   
   System.out.println("Balance Before Change: "+act2.getBalance());
   act2.withdraw(3000);
   act2.deposit(2000);
   System.out.println("Balance Is: "+act2.getBalance());
   System.out.println("Monthly Interest: " +act2.getMonthlyInterest());
   sc.close();
  }
}