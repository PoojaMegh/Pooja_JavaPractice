/*Create a Banking System which has the following functionality. 

Create two object to perform the below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.*/

package pooja;

public class Assignment14 {
	
	String uName;
	int balance, dCount, cCount, pCount;
	static int tDebit, tCredit, tPrintBalance;
	
	void setUserDetails(String name, int bal) {
		uName = name;
		balance = bal;
	}
	
	void debitAmt(int amt) {
		if(amt < balance) {
			balance = balance - amt;
			dCount++;
			tDebit++;
		}else
			System.out.println("Insufficient balance.");
	}
	
	void creditAmt(int amt) {
		balance = balance + amt;
		cCount++;
		tCredit++;
	}
	
	void printBalance() {
		System.out.println(uName + "'s current balance is : " + balance);
		pCount++;
		tPrintBalance++;
	}
	
	public static void main(String[] args) {
		Assignment14 user1 = new Assignment14();
		Assignment14 user2 = new Assignment14();
		
		user1.setUserDetails("Pooja", 1000);
		user1.creditAmt(500);
		user1.creditAmt(500);
		user1.debitAmt(600);
		user1.printBalance();
		
		user2.setUserDetails("MeghRaj", 500);
		user2.creditAmt(500);
		user2.creditAmt(300);
		user2.creditAmt(700);
		user2.creditAmt(800);
		user2.creditAmt(200);
		user2.debitAmt(600);
		user2.debitAmt(300);
		
		System.out.println(user1.uName + "'s transactions summary : " + "\nCredits : " + user1.cCount + " times" + "\nDebits : " + user1.dCount + " times" + "\nBalance Printed : " + user1.pCount + " times\n");
		System.out.println(user2.uName + "'s transactions summary : " + "\nCredits : " + user2.cCount + " times" + "\nDebits : " + user2.dCount + " times" + "\nBalance Printed : " + user2.pCount + " times\n");
		System.out.println("All users' transactions summary : " + "\nCredits : " + tCredit + " times" + "\nDebits : " + tDebit + " times" + "\nBalance Printed : " + tPrintBalance + " times");
	}
}