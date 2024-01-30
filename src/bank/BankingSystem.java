/*Create a Banking System which has the following functionality. 

Create two object to perform the below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.

*/

package bank;

public class BankingSystem {

	String uName;
	int dCount, cCount, pCount, balance;
	static int tDebit, tCredit, tPrintBalance;
	
	//Set user details
	void setUserDetails(String name, int bal) {
		uName = name;
		balance = bal;
	}
	
	//Method to debit amount
	void debitAmt(int amt) {
		if(amt < balance) {
			dCount++;
			tDebit++;
			balance = balance - amt;
		} else
			System.out.println("Insufficient balance.");
	}
	
	// Method to credit amount
	void creditAmt (int amt) {
		cCount++;
		tCredit++;
		balance = balance + amt;
	}
	
	//Method to printBalance [it will print current balance]
	void printBalance() {
		pCount++;
		tPrintBalance++;
		System.out.println(uName + "'s Current balance : " + balance);
	}
	
	//individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called
	void printIndivisualTransactionSummary() {
		System.out.println(uName + "'s transactions summary : " + "\nCredits : " + cCount + " times" + "\nDebits : " + dCount + " times" + "\nBalance Printed : " + pCount + " times\n");
	}
	
	//allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called
	static void printAllTransactionSummary() {
		System.out.println("All users' transactions summary till now : " + "\nCredits : " + tCredit + " times" + "\nDebits : " + tDebit + " times" + "\nBalance Printed : " + tPrintBalance + " times");
	}
	
	//Main Method
	public static void main(String[] args) {
		BankingSystem user1 = new BankingSystem();
		BankingSystem user2 = new BankingSystem();
		
		user1.setUserDetails("Pooja", 1000);
		user1.creditAmt(500);
		user1.creditAmt(500);
		user1.debitAmt(600);
		user1.printBalance();
		user1.printIndivisualTransactionSummary();
		
		user2.setUserDetails("MeghRaj", 500);
		user2.creditAmt(500);
		user2.creditAmt(300);
		user2.creditAmt(700);
		user2.creditAmt(800);
		user2.creditAmt(200);
		user2.debitAmt(600);
		user2.debitAmt(300);
		user2.printIndivisualTransactionSummary();
		
		printAllTransactionSummary();
	}
}
