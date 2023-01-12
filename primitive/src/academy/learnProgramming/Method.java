package academy.learnProgramming;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameOver = true;
		int score = 800;
		int levelCompleted= 5;
		int bonus = 100;
		
		int highScore= calculateScore(true,800,levelCompleted,bonus);
		System.out.println("your final score: "  +highScore );
		
		calculateScore(true,10000,8,200);
		
	
	
	}
	public static int calculateScore(boolean gameover,int Score,int levelCompleted,int bonus) {
	
			if(gameover) {
			  int finalScore = Score+(levelCompleted*bonus);
			  finalScore +=1000;
			
			  return finalScore;
			  
			}else {
				return -1;
			}
	}

}
