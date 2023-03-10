package Array;
import java.util.ArrayList;/////we need to write manually.




public class GroceryList {
	private int[] myNumbers = new int[50];

	private ArrayList<String> groceryList = new ArrayList<String>();
   
	public ArrayList<String> getGroceryList() {
		return groceryList;
	}
	public void addGroceryList(String item) {
		groceryList.add(item);	
		}
	public void printGroceryList() {
		System.out.println("you have "+groceryList.size() +" items in your Grocery List");
		for(int i =0;i<groceryList.size();i++) {
			System.out.println((i+1)+ ", "+ groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(String currentItem,String newItem) {
		int position = findItem(currentItem);
		if(position>=0) {
			modifyGroceryItem(position, newItem);
		}
	}
	private void modifyGroceryItem(int position,String newItem) {
		groceryList.set(position,newItem);
		System.out.println("Grocery Item "+ (position+1) +" has been modified");	
		
	}
	public void removeGroceryItem(String newItem) {
		int position = findItem(newItem);
		if(position>=0) {
			removeGroceryItem(position);
		}
	}
	private void removeGroceryItem(int position) {
		groceryList.remove(position);
	}
	private int findItem(String searchItem) {
		
		return groceryList.indexOf(searchItem);
		
		
	}
	public boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if(position>=0) {
			return true;
		}
		return false;
	}
}
