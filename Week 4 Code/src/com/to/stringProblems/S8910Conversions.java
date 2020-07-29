package com.to.stringProblems;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class S8910Conversions {

	public static void main(String[] args) throws ParseException {
		//double value
		double dnum = 99.9999;  
			
		//convert double to string using valueOf() method
		String str = String.valueOf(dnum);  
			
		//displaying output string after conversion
		System.out.println("Double to string: "+str);  
		
		int i=200;  
		String s=String.valueOf(i);  
		System.out.println("Integer to string: " + i);
		
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        System.out.println("Converted date and time to String: " + strDate);  
        
        String sDate1="31/12/1998";  
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
        System.out.println("Convert string to date and time: ");
        System.out.println(sDate1+"\t"+date1); 
        
	}

}
