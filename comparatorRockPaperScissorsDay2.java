package Utils;

public class comparatorRockPaperScissorsDay2 {

	int Rock = 1;
	int Paper = 2;
	int Scissor = 3;
	
	public boolean comparatorWinRockPaperScissors(String mine, String opponent) {
		//A,X : Rock
		//B,Y : Paper
		//C,Z : Scissor
		switch(mine) {
			case "X": 
						if(opponent.equals("C")) {
							return true;
						}
						break;
	
			case "Y": 
						if(opponent.equals("A")) {
							return true;
						}
						break;
	
			case "Z": 
						if(opponent.equals("B")) {
							return true;
						}
						break;
			default: 
						return false;
		}
		return false;
	}
	
	public boolean comparatorDrawRockPaperScissors(String mine, String opponent) {
		//A,X : Rock
		//B,Y : Paper
		//C,Z : Scissor
		switch(mine) {
			case "X": 
						if(opponent.equals("A")) {
							return true;
						}
						break;
	
			case "Y": 
						if(opponent.equals("B")) {
							return true;
						}
						break;
	
			case "Z": 
						if(opponent.equals("C")) {
							return true;
						}
						break;
			default: 
						return false;
		}
		return false;
	}
	
	public Integer comparatorPointsRockPaperScissors(String opponent) {
		//A,X : Rock
		//B,Y : Paper
		//C,Z : Scissor
		switch(opponent) {
			case "X": 
						return Rock;
			case "Y": 
						return Paper;
			case "Z": 
						return Scissor;
			default: 
						return 0;
		}
	}
	
	public String comparatorNewStrategyRockPaperScissors(String mine, String opponent) {
		//A : Rock
		//B : Paper
		//C : Scissor
		//X : Lose
		//Y : Draw
		//Z : Win
		switch(mine) {
			case "X": 
						return oppositePickLose(opponent);
			case "Y": 
						return samePick(opponent);
			case "Z": 
						return oppositePickWin(opponent);
			default: 
						return null;
		}
	}
	
	public String oppositePickWin(String opponent) {
		//A,X : Rock
		//B,Y : Paper
		//C,Z : Scissor
		switch(opponent) {
			case "A": 
						return "Y";
			case "B": 
						return "Z";
			case "C": 
						return "X";
			default: 
						return null;
		}
	}
	public String oppositePickLose(String opponent) {
		//A,X : Rock
		//B,Y : Paper
		//C,Z : Scissor
		switch(opponent) {
			case "A": 
						return "Z";
			case "B": 
						return "X";
			case "C": 
						return "Y";
			default: 
						return null;
		}
	}
	
	public String samePick(String opponent) {
		//A,X : Rock
		//B,Y : Paper
		//C,Z : Scissor
		switch(opponent) {
			case "A": 
						return "X";
			case "B": 
						return "Y";
			case "C": 
						return "Z";
			default: 
						return null;
		}
	}
}
