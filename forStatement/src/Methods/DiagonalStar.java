package Methods;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		diagonalStar(8);

	}
    public static void diagonalStar(int number) {
    	if(number<5) {
    		System.out.println("Invalid Value");
    	}else {
    		
    		
    		for(int row = 1;row<=number;row++) {
    			for(int column=1;column<=number;column++) {
    				
    				if(row == 1||row==number||column ==1||column == number||column == row||column ==(number-row+1)) {
    					System.out.print("*");
    				}else {
    					System.out.print(" ");
    				}	
    			}
    			System.out.println();
    			
    		
    	}
    }
}
}