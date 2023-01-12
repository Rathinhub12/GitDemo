package Array;
import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> mycontacts;
	
	
	public MobilePhone(String myNumber) {
		super();
		this.myNumber = myNumber;
		this.mycontacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName())>=0) {
			System.out.println("Contact is already on file");
			return false;
		}
		mycontacts.add(contact);
		return true;
	}
	
	public boolean updateContact(Contact oldContact,Contact newContact) {
		int foundPosition= findContact(oldContact);
		if(foundPosition<0) {
			System.out.println(oldContact.getName() + " not found");
			return false;
		}else if(findContact(newContact.getName())!= -1)){
			System.out.println("Contact with name " +newContact.getName()+ " already Exists.update was not successfull.");
		}
		this.mycontacts.set(foundPosition,newContact);
		System.out.println(oldContact.getName()+" was replaced by "+newContact.getName());
		return true;
		
	}
	
	public boolean removeContact(Contact contact) {
		int foundPosition= findContact(contact);
		if(foundPosition<0) {
			System.out.println(contact.getName() + " not found");
			return false;
	}
		this.mycontacts.remove(foundPosition);
		System.out.println(contact.getName() + " was deleted");
		return true;
	}
	private int findContact(Contact contact) {
		return this.mycontacts.indexOf(contact);
	}
	private int findContact(String contactName) {
		for(int i =0;i<this.mycontacts.size();i++) {
			Contact contact = this.mycontacts.get(i);
			if(contact.getName().equals(contactName)) {
			return i;
		}
	}
	return -1;

}
    public String queryContact(Contact contact) {
    	if(findContact(contact)>=0) {
    		return contact.getName();
    	}
    	return null;
    }
    public void printContacts() {
    	System.out.println("Contact List");
    	for(int i=0;i<this.mycontacts.size();i++) {
    		System.out.println((i+1)+ " ,"+this.mycontacts.get(i).getName()+"->"+this.mycontacts.get(i).getPhoneNo());
    	}
    }
    
    public Contact queryContact(String name){
    	int position= findContact(name);
    	if(position>=0) {
    			return this.mycontacts.get(position);
    	}
    	return null;
    }
	
}
