package accountManagerComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.techouts.sorting.Movie;

import accountManagerModelComparable.BankAccount;
import accountManagerModelComparable.BankAccountsPrint;

import java.text.NumberFormat;

public class AccountManager {

	public static void main(String[] args) {

		
        
       
		
		
		List<BankAccount> bankAccounts = new LinkedList<>();  ////PPT3 Array List to store all Bank Account Objects
		
		BankAccount bankAccount1 = new BankAccount();
		bankAccounts.add(bankAccount1);
		bankAccount1.setOwnerName("Tom");
		List<String> addresses = List.of("124 Mulberry St.", "109 Cherry St.");
		bankAccount1.setAddresses(addresses);
		bankAccount1.mapAdd(bankAccount1.getOwnerName(), bankAccount1.getAddresses());
		bankAccount1.setBalance(2000);
		
		BankAccount bankAccount2 = new BankAccount();
		bankAccounts.add(bankAccount2);
		bankAccount2.setOwnerName("Charlie");
		List<String> addresses2 = List.of("125 Mulberry St.", "110 Cherry St.");
		bankAccount2.setAddresses(addresses2);
		bankAccount2.mapAdd(bankAccount2.getOwnerName(), bankAccount2.getAddresses());
		bankAccount2.setBalance(1000);
		
		BankAccount bankAccount3 = new BankAccount();
		bankAccounts.add(bankAccount3);
		bankAccount3.setOwnerName("Brittany");
		List<String> addresses3 = List.of("126 Mulberry St.", "111 Cherry St.");//
		bankAccount3.setAddresses(addresses3);
		bankAccount3.mapAdd(bankAccount3.getOwnerName(), bankAccount3.getAddresses());
		bankAccount3.setBalance(3000);
		
		BankAccount bankAccount4 = new BankAccount();
		bankAccounts.add(bankAccount4);
		bankAccount4.setOwnerName("Amber");
		List<String> addresses4 = List.of("127 Mulberry St.", "112 Cherry St.");//
		bankAccount4.setAddresses(addresses3);
		bankAccount4.mapAdd(bankAccount3.getOwnerName(), bankAccount3.getAddresses());
		bankAccount4.setBalance(4000);
		

		
		
		 System.out.println(bankAccount1);
	        
	     BankAccountsPrint bankAccountsPrint = new BankAccountsPrint();
		 bankAccountsPrint.getBankAccounts(bankAccounts);
		 
		 
	        System.out.println(""); 
	        System.out.println("Above is the Bank Account in list"); 	
	        System.out.println("");
		
		
		
		double intf = 100.05;
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("Added with interface: " + defaultFormat.format(intf)); 
		
		
		//using comparable interface to sort account by most money first
		
		//forward order
		BankAccount.order = 1;
		System.out.println("Decending order: ");
		System.out.println("");
		Collections.sort(bankAccounts);
		System.out.println("after sorting by most money first using comparable interface:");
		for (int i = 0; i < bankAccounts.size(); i++) {
			bankAccounts.get(i).getBalance(); //also prints
		}
		
		//reverse order//
		BankAccount.order = -1;
		System.out.println("Ascending order: ");
		System.out.println("");
		Collections.sort(bankAccounts);
		System.out.println("after sorting by least money first using comparable interface:");
		for (int i = 0; i < bankAccounts.size(); i++) {
			bankAccounts.get(i).getBalance();
		}

		//using comparator
		Comparator<BankAccount> balanceCompare = new BalanceCompare();
		Collections.sort(bankAccounts, balanceCompare);

		for (int i = 0; i < bankAccounts.size(); i++) {
			System.out.println(bankAccounts.get(i).getBalance());
		}
		
		//sorting accounts by name
		System.out.println("Sorting by names:");
		NamesCompare nameCompare= new NamesCompare();
		Collections.sort(bankAccounts,nameCompare);
		for (int i = 0; i < bankAccounts.size(); i++) {
			System.out.println(bankAccounts.get(i).getOwnerName());
		}
		
	}

}

class BalanceCompare implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount b1, BankAccount b2) {
		if (b1.getBalance() < b2.getBalance()) {
			return 1;
		} else if (b1.getBalance() > b2.getBalance()) {
			return -1;
		}
		return 0;
	}

}

class NamesCompare implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount b1, BankAccount b2) {

		return b1.getOwnerName().compareTo(b2.getOwnerName());
	}

}
