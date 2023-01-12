package Interfaces.Example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Player tim = new Player("Tim",10,15);
		System.out.println(tim.toString());
		saveObject(tim);
		
		tim.setHitpoints(8);
		System.out.println(tim);
		tim.setWeapon("StormBringer");
		saveObject(tim);
		//loadObject(tim);
		System.out.println(tim);
		
		isaveable wereWolf = new Monster("wereWolf",20,40);
		System.out.println(((Monster) wereWolf).getStrength());
		saveObject(wereWolf);

	}
    public static ArrayList<String> readValues(){
    	ArrayList<String> values=new ArrayList<>();
    	
    	Scanner scanner = new Scanner(System.in);
    	boolean quit = false;
    	int index = 0;
    	System.out.print("Chhose\n"+
    	                   "1 to enter a String\n"+
    			           "0 to quit");
    	while(!quit) {
    		System.out.print("Choose an Option: ");
    		int choice = scanner.nextInt();
    		scanner.nextLine();
    		switch(choice) {
    		case 0:
    			quit = true;
    			break;
    		case 1:
    			System.out.print("Enter a String: ");
    			String stringInput = scanner.nextLine();
    			values.add(index, stringInput);
    			index++;
    			break;
    		}
    		}
    	return values;
    }
    
    public static void saveObject(isaveable objectToSave) {
    	for(int i=0;i<objectToSave.write().size();i++) {
    		System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
    	}
    	
    }
    
    public static void loadObject(isaveable objectToLoad) {
    	ArrayList<String> values = readValues();
    	objectToLoad.read(values);
    }
    
    
    
}
