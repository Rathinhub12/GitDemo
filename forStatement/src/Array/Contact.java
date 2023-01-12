package Array;
import java.util.ArrayList;

public class Contact {
	private String name;
	private String phoneNo;
	
	public Contact(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	public static Contact createContact(String name,String phoneNo) {
		return new Contact(name,phoneNo);
		
		
		
	
	
	
	
}
//	private ArrayList<String> contactList = new ArrayList<String>();
//
//	public ArrayList<String> getContactList() {
//		return contactList;
//	}
//	
//	public void printContact(String Name) {
//		System.out.println("you have "+contactList.size() +" items in your Contact List");
//		for(int i =0;i<contactList.size();i++) {
//			System.out.println((i+1)+ ", "+ contactList.get(i));
//		}
//	}
//	
//	public void storeContact(int number,String name) {
//		contactList.add(number,name);
//	}
//	
//	public void modifyContact(int number,String Name) {
//		
//		
//	}
//	
//    public void removeContact(String name) {
//    	
//    }
//    private int queryContact(String name) {
//    	return contactList.indexOf(name);
//    }
//    public boolean searchContact(String name) {
//    	int position = queryContact(name);
//    	if(position>=0) {
//    		
//    	}
    }
//}
