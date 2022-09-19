package com.lab1credentials.week2oops;
import java.util.Arrays;
import java.util.Random;

public class CredentialService{
	public static char[] genpassword(){	
	
	int length=7; // it will generate password containing 7character
	String CapitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallletters="abcdefghijklmnopqrstuvwxyz";
	String Numbers="0123456789";
	String Symbols="`~!@#$%^&*()_+{}|\':<>?/.,;";
	String values=Numbers+CapitalLetters+smallletters+Symbols;
	Random password=new Random();
	char[] genpassword=new char[length];	
	for(int i=0;i<length;i++) {
		genpassword[i]=values.charAt(password.nextInt(values.length()));
}
	return genpassword;
	}
	
	public String genEmailaddress(String Firstname, String Lastname, String department) {
		
		return Firstname+Lastname+"@"+department+".oops.com";
	}
public static void showCredentials(String Firstname,String email,char[] pwd){
	 System.out.println("Dear "+Firstname+" your generated credentials are as follows:");
	 System.out.println("Email ID : "+ email);
	 System.out.println("Password : "+ Arrays.toString(pwd));
	 }
}


//generateEmailAddress 
//showCredentials

