package Array;

import java.util.Scanner;

public class MainMobilePhone {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0839 209 3983");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\n Enter action: 6 to show available actions. ");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
			case 0: 
	    		System.out.println("\n shutting down");
	    		quit = true;
	    		break;
	    	case 1:
	    		mobilePhone.printContacts();
	    		break;
	    	case 2:
	    		addNewContact();
	    		break;
	    	case 3:
	    		updateContact();
	    		break;
	    	case 4:
	    		removeContact();
	    		break;
	    	case 5:
	    		queryContact();
	    		break;
	    	case 6:
	    		printActions();
	    		break;
	    	
			}
		}
		
		
		 
	}
	
	private static void addNewContact() {
		System.out.println("Enter a new Contact Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Phone Number");
		String phone = scanner.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New Contact added: name "+name+", phone "+phone);
		}else {
			System.out.println("Contact add, "+name+" already on file");
		}
		
		}
        
	private static void updateContact() {
		System.out.println("Enter a existing Contact Name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord =  mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new Contact Name:");
		String newName = scanner.nextLine();
		System.out.println("Enter new Phone Number");
		String newPhone = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newPhone);
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully updating record");
		}else {
			System.out.println("Error updating record");
		}
		
	}
	private static void removeContact() {
		System.out.println("Enter a new Contact Name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord =  mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Successfully deleted");
		}else {
			System.out.println("Error deleting record");
		}
	}
	
	private static void queryContact() {
		System.out.println("Enter a new Contact Name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord =  mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Name "+existingContactRecord.getName()+"phone no is "+existingContactRecord.getPhoneNo());
		
	}
	
	public static void startPhone() {
		System.out.println("Starting Phone.....");
	}
	
	public static void printActions() {
  	  System.out.println("\nPress");
  	  System.out.println("\t 0 - To shutdown.");
  	  System.out.println("\t 1 - To print the list of Contacts.");
  	  System.out.println("\t 2 - To add a new contact.");
  	  System.out.println("\t 3 - To update an existing contact.");
  	  System.out.println("\t 4 - To remove an existing contact");
  	  System.out.println("\t 5 - To search an existing contact");
  	  System.out.println("\t 6 - To print a list of available contacts.");
  	  System.out.println("choose your actions: ");
  	  }


}
