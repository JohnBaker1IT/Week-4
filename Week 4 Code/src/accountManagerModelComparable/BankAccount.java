package accountManagerModelComparable;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.techouts.sorting.Movie;

public class BankAccount  implements Comparable<BankAccount>{    // PPT  Abstract classes can have implement and non implement methods. Children must implement non implemented methods.
	
	public static int order = 1;
	private String ownerName = "Tom";   // Initialize the Bank Account super class
	private String gender = "Male"; //PPT 1  Set to private to encapsulate getters and setters
	private int age = 40;
	private List<String> addresses = new LinkedList<>();
	
	private double balance = 3000;
	
	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public void mapAdd(String name, List<String> addresses) {
		//ownerAddresses.put(name, addresses);
	}
	
	
	
	
	
	public double getBalance() { 
		NumberFormat defaultFormat =
		NumberFormat.getCurrencyInstance(); String msg = ownerName +  ": " + 
		defaultFormat.format(balance) + " balance";
		System.out.println(msg); return balance; 
		} 
	public void setBalance(double
		balance) { this.balance = balance; 
	}
	
	//@Override
	public int compareTo(BankAccount b) {
		// sorting according to descending year
		if (this.balance < b.balance) {// this object year is less than movie object year
			return 1 * order;
		} else if (this.balance > b.balance) { // this object year is greater than movie object year
			return -1 * order;
		}

			return 0; // both are equal
	}

	
	
	
	
	
	 
	 
	 
	 
			
}
