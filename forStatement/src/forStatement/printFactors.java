package forStatement;

public class printFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printFactors(6);

	}
    public static void printFactors(int num) {
//    	int result[]
    	if(num<1) {
    		System.out.println("Invalid Value");
    	}else {
    	    for(int i =1;i<=num;i++) {
    		   if(num%i == 0) {
    			   System.out.println("Factor of "+num + " = " +i);
    		}
    	}
    }	
}
}
