package crudCma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class First {
	
	public static void main(String[] args) {
		
		List<Customer> customers = new ArrayList<Customer>();
		Scanner userInt = new Scanner(System.in);
		Scanner userString = new Scanner(System.in);
		int choice;
		
		customers.add(new Customer(1000, "Luffy", "Monkey", "9000", "Gent"));
		customers.add(new Customer(1001, "Zoro", "Roronoa", "9000", "Gent"));
		customers.add(new Customer(1002, "Sanji", "Vinsmoke", "8000", "Kortrijk"));
		customers.add(new Customer(1003, "Brook", "Undead", "1000", "Brussel"));

		do {
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. SEARCH");
			System.out.println("4. DELETE");
			System.out.println("5. UPDATE");
			System.out.println("ENTER YOUR CHOICE: ");
			choice = userInt.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("-----------------------------");
				System.out.println("Enter customerId: ");
				int customerNo = userInt.nextInt();
				System.out.println("Enter first name: ");
				String firstName = userString.nextLine();
				System.out.println("Enter family name: ");
				String familyName = userString.nextLine();
				System.out.println("Enter postalcode: ");
				String postalCode = userString.nextLine();
				System.out.println("Enter city name: ");
				String city = userString.nextLine();
				
				customers.add(new Customer(customerNo, firstName, familyName, postalCode, city));
				System.out.println("-----------------------------");
			break;
			
			case 2:
				System.out.println("-----------------------------");
				Iterator<Customer> countCustomer = customers.iterator();
				while(countCustomer.hasNext()) {
					Customer x = countCustomer.next();
					System.out.println(x); 
				}
				System.out.println("-----------------------------");
			break;
			
			case 3:
				boolean found = false;
				System.out.println("Enter customerId to search: ");
				int customerId = userInt.nextInt();
				
				System.out.println("-----------------------------");
				countCustomer = customers.iterator();
				while(countCustomer.hasNext()) {
					Customer x = countCustomer.next();
					if(x.getCustomerId() == customerId) {
						System.out.println(x);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found...");
				}
				System.out.println("-----------------------------");
			break;
			
			case 4:				
				found = false;
				System.out.println("Enter customerId to delete: ");
				customerId = userInt.nextInt();
				
				System.out.println("-----------------------------");
				countCustomer = customers.iterator();
				while(countCustomer.hasNext()) {
					Customer x = countCustomer.next();
					if(x.getCustomerId() == customerId) {
						countCustomer.remove();
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record not found...");
				} else {
					System.out.println("Record is deleted succesfully...");
				}
				System.out.println("-----------------------------");
			break;
			
			case 5:
				found = false;
				System.out.println("Enter customerId to update: ");
				customerId = userInt.nextInt();
				
				ListIterator<Customer> li = customers.listIterator();
				while(li.hasNext()) {
					Customer x = li.next();
					if(x.getCustomerId() == customerId) {
						System.out.println("Enter new first name: ");
						firstName = userString.nextLine();
						System.out.println("Enter new last name: ");
						familyName = userString.nextLine();
						System.out.println("Enter new postalcode: ");
						postalCode = userString.nextLine();
						System.out.println("Enter new city name: ");
						city = userString.nextLine();
						
						li.set(new Customer(customerId, firstName, familyName, postalCode, city));
						found = true;						
					}
				}
				if(!found) {
					System.out.println("Record not found...");
				} else {
					System.out.println("Record is updated succesfully...");
				}
				System.out.println("-----------------------------");
			break;
			}
			
		} while (choice!=0);
	}
}
