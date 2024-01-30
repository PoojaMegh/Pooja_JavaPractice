/*Assignment - 14 : 7th May'2023

Create a Banking System which has the following functionality. 

Create two object to perform the below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .

Hint : Create 3 non static instance variables.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time

user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.

Hint : Create 3 static variables will be required.

Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE:  You should have setUserDetails method to set username and initial Balance .*/

package pooja.rahul;

public class BankingSystem {
	String userName ;
	int balance = 0;
	int dCount , cCount, pCount;
	static int debits, credits, prints;
	
	void setUserDetails (String name , int amount) {
		userName = name;
		balance = amount;
	}
	
	void debitBalance(int amount) {
		if(balance >= amount) {
		balance = balance - amount;
		System.out.println("Amount of Rs. " +amount+ " got successfully debited from account and the remaining balance is Rs. " +balance);
		dCount++;
		debits++;
		}	
	}
	
	void creditBalance(int amount) {
		balance = balance + amount; 
		System.out.println("Amount of Rs. " +amount+ " got successfully credited to your account and the available balance is Rs. " +balance);
		cCount++;
		credits++;
	}
	
	void printBalance() {
		System.out.println("Your available balance is Rs. " +balance);
		pCount ++;
		prints++;
	}
	
	void individualTransactionSummary(){
		System.out.println("Below is the transaction summary of User - " +userName);
		System.out.println("Credit = " +cCount+ " times");
		System.out.println("Debit = " +dCount+ " times");
		System.out.println("Print Balance = " +pCount+ " times");
	}
	
	static void allTransactionSummary() {
		System.out.println("Below is the transaction summary of all the Users");
		System.out.println("Total Credit transactions = " +credits);
		System.out.println("Total Debit transactions = " +debits);
		System.out.println("Total Print Balance transactions = " +prints);
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem = new BankingSystem();
		bankingSystem.setUserDetails("Rahul", 10000);
		bankingSystem.debitBalance(1000);
		bankingSystem.debitBalance(3000);
		bankingSystem.printBalance();
		bankingSystem.creditBalance(7000);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary();
		System.out.println("===================================================");
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setUserDetails("Rohit", 18000);
		bankingSystem1.debitBalance(4000);
		bankingSystem1.printBalance();
		bankingSystem1.creditBalance(2000);
		bankingSystem1.creditBalance(6000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		System.out.println("===================================================");
		BankingSystem.allTransactionSummary();
	}

}
