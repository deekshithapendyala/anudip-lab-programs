package sample;
import java.util.Scanner;
class Acccount {
	private String accountType;
    private double balance;
    public Acccount(String accountType) {
        this.accountType = accountType;
        this.balance = balance;
    }
    public Acccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance =balance;
    }
    public void deposit(double amount) {
        balance= balance + amount;
        System.out.println("Deposit of" + amount );
    }
    public void deposit(String depositType, double amount) {
    	balance=balance+amount;
    	System.out.println("Deposit of " + amount + " by " + depositType);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance=balance - amount;
            System.out.println("Withdrawal" + amount );
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public double checkBalance() {
        return balance;
    }
}

public class AccountsBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 Acccount savingsAcc = new Acccount("Savings");
		 Acccount check=new Acccount("Checking");
		 System.out.print("Enter deposit amount for savings account: ");
	        double depositAmount = scanner.nextDouble();
	        savingsAcc.deposit(depositAmount);
	        System.out.print("Enter deposit amount for checking account: ");
	        depositAmount = scanner.nextDouble();
	        check.deposit(depositAmount);
	        System.out.print("Enter withdrawal amount from savings account: ");
	        double withdrawAmount = scanner.nextDouble();
	        savingsAcc.withdraw(withdrawAmount);
	        System.out.print("Enter withdrawal amount from checking account: ");
	        withdrawAmount = scanner.nextDouble();
	        check.withdraw(withdrawAmount);
	        System.out.println("Savings Account Balance:" + savingsAcc.checkBalance());
	        
	        
	        System.out.println("Check Account Balance:" + check.checkBalance());

	}

}
