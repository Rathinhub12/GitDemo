package AutoboxingInboxing;

import java.util.ArrayList;

class IntClass{
	private int myValue;

	public IntClass(int myValue) {
		super();
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
}

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[10];
		int[] intArray = new int[10];
        
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Tim");
		
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54));
		
		//@SuppressWarnings("deprecation")
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.56);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			intArrayList.add(Integer.valueOf(i));
		}
		
		for(int i=0;i<intArrayList.size();i++) {
			System.out.println(i+ "---->" +intArrayList.get(i).intValue());
		}
		Integer myIntValue = 56;
		int myInt = myIntValue.intValue();	
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for(double dbl=0.0;dbl<=10.00;dbl+=0.5) {
			myDoubleValues.add(Double.valueOf(dbl));
		}
		
		for(int i=0;i<myDoubleValues.size();i++) {
			System.out.println(i+ "---->" +myDoubleValues.get(i).doubleValue());
		}
	}
	
	

}
