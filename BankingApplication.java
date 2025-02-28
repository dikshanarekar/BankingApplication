import java.util.*;

public class BankingApplication {
  public static void main(String[] args) {
    BankAccount obj = new BankAccount("Disha Vakhej", "9893660");
    obj.showMenu();

  }
}

class BankAccount {
  int balance;
  int previousTransction;
  String customerName;
  String customerId;

  BankAccount(String cname, String cId) {
    customerName = cname;
    customerId = cId;
  }

  // Amount desposit
  void deposit(int amount) {
    if (amount != 0) {
      balance = balance + amount;
      previousTransction = amount;
    }
  }

  // Amount Withdraw
  void withdraw(int amount) {
    if (amount != 0) {
      balance = balance - amount;
      previousTransction = -amount;
    }
  }

  // previous transaction History
  void getPreviousTransaction() {
    if (previousTransction > 0) {
      System.out.println("Deposit Amount : " + previousTransction);

    } else if (previousTransction < 0) {
      System.out.println("Withdraw Amount : " + Math.abs(previousTransction));
    } else {
      System.out.println("No Transactions occured..");
    }
  }

  void showMenu() {
    char opt = '\0';
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome : " + customerName);
    System.out.println("Your Id :" + customerId);
    System.out.println("\n");
    System.out.println("A. Check Balance");
    System.out.println("B. Deposit");
    System.out.println("C. Withdrawn");
    System.out.println("D. Previous Transaction");
    System.out.println("E. Exit");

    do {
      System.out.println("=============================================================");
      System.out.println("Enter an option ");
      System.out.println("=============================================================");
      opt = sc.next().charAt(0);
      System.out.println("\n");

      switch (opt) {

        case 'A': {
          System.out.println("*************************************************************");
          System.out.println("Balance : " + balance);
          System.out.println("*************************************************************");
          System.out.println("\n");
          break;
        }
        case 'B': {
          System.out.println("*************************************************************");
          System.out.println("Enter the amount to be deposit");
          System.out.println("*************************************************************");
          int amount = sc.nextInt();
          deposit(amount);
          System.out.println("\n");
          break;
        }
        case 'C': {
          System.out.println("*************************************************************");
          System.out.println("Enter the amount to be withdraw");
          System.out.println("*************************************************************");
          int amount2 = sc.nextInt();
          withdraw(amount2);
          System.out.println("\n");
          break;
        }
        case 'D': {
          System.out.println("*************************************************************");
          getPreviousTransaction();
          System.out.println("*************************************************************");
          System.out.println("\n");
          break;
        }
        case 'E': {
          System.out.println("*************************************************************");
          break;
        }
        default: {
          System.out.println("Invalid Entry!! Please enter again.");
          break;
        }

      }

    } while (opt != 'E');
    {
      System.out.println("Thanks for Visiting...");
    }

    sc.close();
  }

}
