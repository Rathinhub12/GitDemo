package Interfaces;

public class MobilePhone implements ITelephone{
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}
	
	@Override
	public void powerOn() {
		isOn= true;
		System.out.println("No actions taken,desk phone doesnot have a power button");
		
	}
	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
		 System.out.println("Now ringing "+ phoneNumber+" on mobile Phone");
		}else {
			System.out.println("Phone is switched off");
		}
	}
	@Override
	public void answer() {
		if(isRinging) {
		System.out.println("Answering the mobile phone");
		isRinging=false;
		}		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Melody Ring");
		}else {
			isRinging=false;
			System.out.println("Mobile phone not on");
		}
		
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		
		return isRinging;
	}
	
}
