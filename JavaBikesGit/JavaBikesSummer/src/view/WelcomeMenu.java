package view;

import java.io.IOException;
import java.util.*;

import control.Control;
import model.Customer;

public class WelcomeMenu {
	
	Scanner input = new Scanner(System.in);	

	Customer customerclass = new Customer();
	Control customerCtrl = new Control();
	
	static WelcomeMenu welcome = new WelcomeMenu();
	
	public void welcomeMenu () throws IOException

	{
		customerCtrl.printwelcomeMenu();

	do
	{
		try
		{
			int selectwelcomeMenu = input.nextInt();
			switch (selectwelcomeMenu)
			{
			case 1:
				customerCtrl.printCreateCustomer();
				
				int selectCreateCustomer = input.nextInt();
				switch(selectCreateCustomer)
				
				{
				case 1:
					Customer customer = new Customer();
					customer = customerCtrl.createCustomer();
					
					welcomeMenu();
					break;
					
				case 2:
					welcomeMenu();
					break;
				}
				
			case 2:
				customerCtrl.printCustomerLogin();
				
				int selectCustomerLogin = input.nextInt();
				switch (selectCustomerLogin)
				{
				case 1:
					customerCtrl.loginAsCustomer();
					break;
					
				case 2:
					loginMenu();
					break;
				}
				
			case 3:
				ProductView.browseProduct();
				ProductView.printProducts();
				
				int selectProductMenu = input.nextInt();
				switch (selectProductMenu)
				{
				case 1:
					welcomeMenu();
					break;
				}
				
			case 4:
				System.out.println("The Program will now shut down");
				System.exit(0);
				break;
				
				default:
					System.out.println("\nChoose a number from 1 to 4: ");
					input.next();
					break;
				
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("\nChoose a number from 1 to 4: ");
			input.next();
			break;
		}
	}
	while (true);
	}

	private void loginMenu() {
		System.out.println("You have now created an account with Java Bikes and can now login");
		System.out.println("|1| Login" );
		System.out.println("|2| Browse bikes" );
		System.out.println("|3| End Session" );			
	}
}