package com.lab1employee.week2oops;

import java.util.Scanner;

import com.lab1credentials.week2oops.CredentialService;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Harsh", "Jariwala");
		CredentialService cs = new CredentialService();
		String generatedEmail = "";
		char[] generatedPwd;

		// Preparation of Department Selection using Scanner and Switch cases

		System.out.println("Please Enter the Department from the following:" + "\n Note:Enter any number from 1 to 4");
		System.out.println(" 1.Technical \n 2.Administraton \n 3.Humanresource \n 4.Legal");
		Scanner sc = new Scanner(System.in);
		int dept;
		dept = sc.nextInt();

		switch (dept) {
		case 1: {
			System.out.println("Technical");
			generatedEmail = cs.genEmailaddress(employee.getFirstname(), employee.getLastname(), "tech");
			break;

		}
		case 2: {
			System.out.println("Admin");
			generatedEmail = cs.genEmailaddress(employee.getFirstname(), employee.getLastname(), "admin");
			break;
		}
		case 3: {
			System.out.println("hr");
			generatedEmail = cs.genEmailaddress(employee.getFirstname(), employee.getLastname(), "hr");
			break;
		}
		case 4: {
			System.out.println("Legal");
			generatedEmail = cs.genEmailaddress(employee.getFirstname(), employee.getLastname(), "legal");
			break;
		}
		default:
			System.out.println("yeh Wrong Number hei!!");

			System.exit(-1);

		} // Switch Ends here...
		generatedPwd = CredentialService.genpassword();
		CredentialService.showCredentials(employee.getFirstname(), generatedEmail, generatedPwd);
		sc.close();
	}

}