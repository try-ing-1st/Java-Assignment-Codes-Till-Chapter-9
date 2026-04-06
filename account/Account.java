import java.util.Date;

public class Account {
  private int id;
  private double balance;
// Interest Rate Same For EveryOne
  private static double annualInterestRate;
// Date
  private Date dateCreated = new Date();
// Constructors
  public Account() {
  }
  public Account(int userId, double initial_Balance) {
   id = userId;
   balance = initial_Balance;
  }
// Id Setter/Mutator
  public void setId(int newId) {
   id = newId;
  }
// Id Getter/Accessor
  public int getId() {
   return id;
  }
// Balance Setter/Mutator & Getter/Accessor
  public void setBalance(double newBalance) {
   balance = newBalance;
  }
  public double getBalance() {
   return balance;
  }
// Interest Rate Setter/Mutator & Accessor/Getter
  public void setInterestRate(double rate) {
// In Percentage Form
   annualInterestRate = rate;
  }
  public double getInterestRate() {
   return annualInterestRate;
  }
// Accessor Only For Date
  public Date getDateCreated() {
   return dateCreated;
  }
// Getting Monthly Interest Rate
  public double getMonthlyInterestRate() {
   return (annualInterestRate / 100) / 12;
  } 
// Getting Monthly Interest
  public double getMonthlyInterest() {
   return balance * getMonthlyInterestRate();
  }
// Withdraw Method
  public void withdraw(double amount) {
   if (amount > this.balance) {
     System.out.println("In-Sufficient Balance!");
      }
   else {
     this.balance -= amount;
      }
  }
// Deposit Method
  public void deposit(double amount) {
   this.balance += amount;
  }
}