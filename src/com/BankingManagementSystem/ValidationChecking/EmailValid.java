package com.BankingManagementSystem.ValidationChecking;
import java.util.ArrayList;

import com.BankingManagementSystem.FileHandling.*;
import com.BankingManagementSystem.frameDesign.*;
import com.BankingManagementSystem.Pojo.*;

public class EmailValid {
	int accNo;
	String a;
	ArrayList<CustomerDetails> userlist = CustomerDetailsFile.readDataFromFile();	
	
	public void Email(String msg,String accno) 
	{
		
		a=userlist.get(Search.searchId(accno)).getCemailid();
		
		String[] to={a};
	try{	
		if(EmailSender.sendMail("email", "password",msg,to))
			//enter a valid email and password
		{
			System.out.println("email sent");
		}
		else
			System.out.println("error occured");
	 }catch (Exception e) {
		System.out.println(e);
	}
	}
	
	
	/*
	public static void main(String[] args){
		EmailValid obj=new EmailValid();
		
		//obj.main(); //passing account number
	}
	*/
	

}
