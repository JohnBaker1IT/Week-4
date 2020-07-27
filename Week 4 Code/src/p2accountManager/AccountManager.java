package p2accountManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import p2accountManagerModel.BankAccount;
import p2accountManagerModel.BankAccountsPrint;


import java.text.NumberFormat;

public class AccountManager {

	public static void main(String[] args) {

		
        
       
		
		List<BankAccount> bankAccounts = new LinkedList<>();  //PPT3 Array List to store all Bank Account Objects
		
		BankAccount bankAccount1 = new BankAccount();
		bankAccounts.add(bankAccount1);
		bankAccount1.setOwnerName("Tom");
		List<String> addresses = List.of("124 Mulberry St.", "109 Cherry St.");
		bankAccount1.setAddresses(addresses);
		bankAccount1.mapAdd(bankAccount1.getOwnerName(), bankAccount1.getAddresses());
		
		BankAccount bankAccount2 = new BankAccount();
		bankAccounts.add(bankAccount2);
		bankAccount2.setOwnerName("Jim");
		List<String> addresses2 = List.of("125 Mulberry St.", "110 Cherry St.");
		bankAccount2.setAddresses(addresses2);
		bankAccount2.mapAdd(bankAccount2.getOwnerName(), bankAccount2.getAddresses());
		
		BankAccount bankAccount3 = new BankAccount();
		bankAccounts.add(bankAccount3);
		bankAccount3.setOwnerName("Mary");
		List<String> addresses3 = List.of("126 Mulberry St.", "111 Cherry St.");//
		bankAccount3.setAddresses(addresses3);
		bankAccount3.mapAdd(bankAccount3.getOwnerName(), bankAccount3.getAddresses());
		
		 System.out.println(bankAccount1);
	        
	     BankAccountsPrint bankAccountsPrint = new BankAccountsPrint();
		 bankAccountsPrint.getBankAccounts(bankAccounts);
		 
		 
	        System.out.println(""); 
	        System.out.println("Above is the Bank Account in list"); 	
	        System.out.println("");
		
		
		
		double intf = 100.05;
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("Added with interface: " + defaultFormat.format(intf)); 
		
		

		
		
		
		
	}

}
