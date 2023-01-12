package OOP1Practice;

public class SimpleCalculator {
	private double firstNumber;
	private  double secondNumber;
	
	
	//Getter and setter:
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() {
		double sum = (this.firstNumber+this.secondNumber);
		return sum;
	}
	
	public double getSubstractionResult() {
		double sub = (this.firstNumber-this.firstNumber);
		return sub;
	}
	
	public double getMultiplicationResult() {
		double mul = (this.firstNumber*this.firstNumber);
		return mul;
	}
	
	public double getDivisionResult() {
		if(this.secondNumber ==0) {
			return 0;
			
		}else {
			double div = (this.firstNumber/this.secondNumber);
			return div;
		}
		
	}

}
