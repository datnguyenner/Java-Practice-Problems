package RouletteGame;

import java.util.Arrays;
import java.util.TreeSet;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table newGame = new Table();
		Player player = new Player();
		String[] winningColors = new String[10];
		player.betColor("Black");
		TreeSet<Integer> maxBetNeeded = new TreeSet<>();
		for(int i = 0; i < 10; i++){
			newGame.spin();
			int bet = player.placeBet();
			newGame.determineWinningColor(newGame.getWinningNumner());
			String winningColor = newGame.getWinningColor();
		}
		
	}

}
