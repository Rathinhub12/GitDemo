package Encapsulation;

//import constructor.Player;

public class Main {

	public static void main(String[] args) {
//      EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
//      System.out.println("Initial health is = "+ player.getHealth());
		
		Printer printer = new Printer(50,true);
		System.out.println("initial pages printed = "+printer.getNumberOfPagesPrinted());
		int numberOfPagesPrinted = printer.printPages(5);
		System.out.println("pages printed was "+ numberOfPagesPrinted+"new Total"+printer.getNumberOfPagesPrinted());
		
} 
}


//// TODO Auto-generated method stub
//Player player = new Player();
//player.name = "tim";
//player.health = 20;
//player.weapon = "sword";
//
//int damage = 10;
//player.loseHealth(10);
//System.out.println("Remaining Health = "+ player.healthRemaining());
//
//damage = 11;
//player.health = 200;
//player.loseHealth(11);
//System.out.println("Remaining Health = "+ player.healthRemaining());
//
//}