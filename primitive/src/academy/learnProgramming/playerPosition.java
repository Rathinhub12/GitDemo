package academy.learnProgramming;

public class playerPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Score = 400;
		String player = "Sachin";
		
		int position = calculateHighScorePosition(Score);
		displayHighScore(player,position);
          
	}
   public static void displayHighScore (String playerName,int playerPosition) {
	  System.out.println(playerName + " managed to get into position " + playerPosition +" on the highscore table"); 
   }
   
   public static int calculateHighScorePosition(int playerScore) {
	   
	   int playerPosition =4;
	   if(playerScore>1000) {
		   playerPosition = 1;
		   
	   }else if(playerScore>500 && playerScore<1000){
		   playerPosition=2;
		  
	   }else if(playerScore>100 && playerScore<500) {
		   playerPosition = 3;
		   
	   }
		   return playerPosition;
	   
   }
}
