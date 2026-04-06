package Test;

import account.Account;

import java.util.Scanner;

public class TestAccount {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);  
  Account act1 = new Account();
 /* int id, pin;
  double balance; */
  /* System.out.print("Enter Pin: ");
  act1.setPin(sc.nextInt());
  System.out.print("Enter Id: ");
  act1.setId(sc.nextInt());
  System.out.print("Enter Balance: ");
  act1.setBalance(sc.nextDouble()); */
// Now Displaying Details But By running Programme Again Checking If Data Saved
  System.out.println("Id: "+act1.getId()+"\n Pin: "+act1.getPin()+"\n Balance: "+act1.getBalance());
  }
}