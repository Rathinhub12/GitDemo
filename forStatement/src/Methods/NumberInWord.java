package Methods;

public class NumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberInWord(10);

	}
    public static void numberInWord(int num) {
    	if(num>=0 && num<=9) {
    	switch(num) {
    	
    	case 0:
    		System.out.println("Zero");
    		break;
    	case 1:
    		System.out.println("One");
    		break;
    	case 2:
    		System.out.println("Two");
    		break;
    	case 3:
    		System.out.println("Three");
    		break;
    	case 4:
    		System.out.println("Four");
    		break;
    	case 5:
    		System.out.println("Five");
    		break;
    	case 6:
    		System.out.println("Six");
    		break;
    	case 7:
    		System.out.println("Seven");
    		break;
    	case 8:
    		System.out.println("eight");
    		break;
    	case 9:
    		System.out.println("Nine");	
    		break;
    	default:
    		System.out.println("Others");
    	}
    	
    }else {
    	System.out.println("Others");
    }
}
}