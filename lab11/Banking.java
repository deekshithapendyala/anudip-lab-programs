package sample;
import java.util.Scanner;

interface BankingInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
class SavingsAccount implements BankingInterface {
    private double balance;
 
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
    	return balance;
    }
}
class Current implements BankingInterface {
    double balance;
    public void deposit(double amount) {
    	 balance=balance+amount;
	        System.out.println("Deposit of" + amount );
	}
    public void withdraw(double amount) {
    	 if (balance >= amount) {
	            balance=balance-amount;
	            System.out.println("Withdrawal" + amount );
	        } else {
	            System.out.println("Insufficient balance");
    	
    }
    }
    public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
		
	}
	
}
    
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		SavingsAccount savings = new SavingsAccount();
		Current c = new Current();
		  System.out.print("Enter amount for saving account: ");
	        double depositAmount = sc.nextDouble();
	        savings.deposit(depositAmount);
	        
	      
	        System.out.print("Enter amount for Current account: ");
	        depositAmount = sc.nextDouble();
	        c.deposit(depositAmount);
	        
	        
	        System.out.print("Enter withdrawal amount from savings account: ");
	        double withdraw = sc.nextDouble();
	        savings.withdraw(withdraw);
	        
	        System.out.print("Enter withdrawal amount from Current account: ");
	        double withdraw1= sc.nextDouble();
	        c.withdraw(withdraw1);
	        System.out.println("Savings Account Balance:" + savings.getBalance());
	        
	        
	        System.out.println("Current Account Balance:" + c.getBalance());
	        

	}

}
