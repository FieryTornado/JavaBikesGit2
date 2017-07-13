package control;

import java.io.*;
import java.util.*;
import model.*;
import view.*;

public class Control {
	
	static WelcomeMenu welcome = new WelcomeMenu();
	static CustomerView customerView = new CustomerView();
	
	public void printwelcomeMenu() {
		System.out.println("Welcome to Java Bikes! Choose one of the following numbers to continue");
		System.out.println("|1| Create an account" );
		System.out.println("|2| Login" );
		System.out.println("|3| Browse bikes" );
		System.out.println("|4| End Session" );	
	}	

	public void printCreateCustomer() 
	{
		System.out.println("\nEnter 1 to create an account with Java Bikes.");		
	}

	// Method to create customer
	public Customer createCustomer() throws FileNotFoundException, IOException
	{		
		Scanner input = new Scanner(System.in);
		String details;
		Customer customer = new Customer();
		
		do
		{
			System.out.println("Enter your First Name: ");
			details = input.nextLine();
			
			if (details.matches("[A-Za-z]+"))
			{
				customer.setFirstName(details);
			}
			else
			{
				System.out.println("You must use Latin Character");
				details = null;
			}
		}
		
		while (details == null);
		
		do
		{
			System.out.println("Enter your Last Name: ");
			details = input.nextLine();
			
			if (details.matches("[A-Za-z]+"))
			{
				customer.setLastName(details);
			}
			else
			{
				System.out.println("You must use Latin Characters");
				details = null;
			}
		}
		
		while (details == null);
		
		do
		{
			System.out.println("Enter a username: Must be at least 5 letters: ");
			details = input.nextLine();
			
			if (details.matches("([A-Za-z]+).{5,}"))
			{
				customer.setUsername(details);
				details = null;
			}		
		else
		{
			System.out.println("Wrong input: Must be at least 5 Latin letters ");
		}
		}	
		
		while (details == null);
		
		do
		{
			System.out.println("Enter a password: Must be at least 5 Characters and contain letters and numbers");
			details = input.nextLine();
			
			if (details.matches("([A-Za-z0-9].{5,}"))
			{
				customer.setPassword(details);
			}
			else
			{
				System.out.println("Wrong password format: Use at least 5 Characters of letters and numbers");
				details = null;
			}
		}
		while (details == null);
		System.out.println("Congratulations: You have created an account with Java Bikes!");
		
		return customer;
	} 

	public void printCustomerLogin() 
	{
		System.out.println("\n|1| Log in" + "\n|2| Return to Welcome Screen");
		
	}

	public void loginAsCustomer() 
	{
		/*Scanner input = new Scanner(System.in);
		String username;
		String password;
		
		int attempt = 0;
		if (attempt == 2)
		{
			System.out.println("You have been locked out after 3 attempts. Please try again later");
			System.exit(0);
		}
		
		boolean loggedIn = false;
		
		do
		{
			attempt++;
			
			System.out.println("Enter your username");
			username = input.next();
			
			System.out.println("Enter your password");
			username = input.next();
			
			for (int i = 0; i < CustomerArrayList.size() &&loggedIn; i++)
				
				if(!CustomerArrayList.get(i).getUsername().equals(username) || username.length() < 5)
				{
					System.out.println("Incorrect username");
					return username(input)
				}
		}*/
	}
}
