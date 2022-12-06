package Days;

import java.util.Iterator;
import java.util.List;

import Utils.comparatorRockPaperScissorsDay2;
import Utils.scannerDay2;

public class day2 {
	final int scoreWin = 6;
	final int scoreDraw = 3;
	final int scoreLose = 0;
	comparatorRockPaperScissorsDay2 comparatorRPS = new comparatorRockPaperScissorsDay2();	

	public void RockPaperScissors() {
		String play;
		String[] parts =  new String[2];
		String opponent;
		String mine;
		int score = 0;
		scannerDay2 scannerDay2 = new scannerDay2();
		List<String> RoundsRockPaperScissor = scannerDay2.returnInputDay2();
		Iterator<String> iterator = RoundsRockPaperScissor.iterator();	

		while(iterator.hasNext()){
			play = iterator.next();
			parts = play.split(" ");
			opponent = parts[0];
			mine = parts[1];
			score += scoreRoundRockPaperScissor( mine, opponent);
		}
		System.out.println("Total score: "+score);
	}

	public void RockPaperScissorsNewStrategy() {
		String play;
		String[] parts =  new String[2];
		String opponent;
		String mine;
		int score = 0;
		scannerDay2 scannerDay2 = new scannerDay2();
		List<String> RoundsRockPaperScissor = scannerDay2.returnInputDay2();
		Iterator<String> iterator = RoundsRockPaperScissor.iterator();

		while(iterator.hasNext()){
			play = iterator.next();
			parts = play.split(" ");
			opponent = parts[0];
			mine = comparatorRPS.comparatorNewStrategyRockPaperScissors(parts[1],opponent);
			score += scoreRoundRockPaperScissor( mine, opponent);
		}
		System.out.println("Total score: "+score);

	}

	public Integer scoreRoundRockPaperScissor(String mine, String opponent) {
		int score = 0;

		if(comparatorRPS.comparatorWinRockPaperScissors(mine, opponent)){
			score += scoreWin;
		}
		else{
			if(comparatorRPS.comparatorDrawRockPaperScissors(mine, opponent)){
				score += scoreDraw;
			}
			else {
				score += scoreLose;
			}
		}
		score += comparatorRPS.comparatorPointsRockPaperScissors(mine);
		return score;

	}

}
