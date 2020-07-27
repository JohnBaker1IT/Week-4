package p2accountManagerModel;

import java.util.List;
import java.util.ListIterator;
import p2accountManagerModel.Customers;
public class BankAccountsPrint {
	
	public int getBankAccounts (List<BankAccount>bankAccounts) {
		// Creating object of ListIterator<String> 
        // using listIterator() method 
        ListIterator<BankAccount> 
            iterator = bankAccounts.listIterator(); 

        // Printing the iterated value 
        System.out.println("\nUsing ListIterator:\n"); 
        while (iterator.hasNext()) { 
            BankAccount bankAccount = iterator.next();
            System.out.println("");
            System.out.println("Owner is : "
                               + bankAccount.getOwnerName());
            
        	System.out.println("Addresses are : "
                    + bankAccount.getAddresses());
            
        	
    		System.out.println(bankAccount.getOwnerName() +"'s addresses in cutomer map: " + Customers.ownerAddresses.get(bankAccount.getOwnerName()));
    		
        } 
		
        System.out.println("Customer map: " + Customers.ownerAddresses);
		
		return 0;
		
	}

}
