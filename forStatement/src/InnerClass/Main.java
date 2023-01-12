package InnerClass;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	

	public static void main(String[] args) {
		
//		class ClickListener implements Button.onClickListener{
//			public ClickListener() {
//				System.out.println("I've been attached");
//			}
//
//			@Override
//			public void onClick(String title) {
//				System.out.println(title+ " Was Clicked");
//				
//			}
//			
//			
//		}
//		btnPrint.setOnClickListener(new ClickListener());
		btnPrint.setOnClickListener(new Button.onClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println(title+ " Was Clicked");
				
			}
		});
		
		listen();
//		GearBox McLaren = new GearBox(6);
////		GearBox.Gear first = McLaren.new Gear(1,12.3);
////		System.out.println(first.driveSpeed(1000));
//		
//		McLaren.operateClutch(true);
//		McLaren.changeGear(1);
//		McLaren.operateClutch(false);
//		System.out.println(McLaren.wheelSpeed(1000));
//		McLaren.changeGear(2);
//		System.out.println(McLaren.wheelSpeed(3000));
//		

	}
	private static void listen() {
		boolean quit=false;
		while(!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
				quit=true;
				break;
			case 1:
				btnPrint.onClick();
			}
		}
	}

}
