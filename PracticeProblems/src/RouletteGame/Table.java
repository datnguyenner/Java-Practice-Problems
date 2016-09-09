package RouletteGame;

import java.util.Random;

public class Table {
	Random rand = new Random();
	private int winningNumner;
	private String winningColor;
	
	public void spin(){		
		this.winningNumner = (rand.nextInt(38-1+1)+1);	
	}
	
	public void determineWinningColor(int winningNumner){
		if(winningNumner == 37 || winningNumner == 38){
			this.winningColor=("Green");
		}else if(winningNumner%2==0){
			this.winningColor="Red";
		}else{
			this.winningColor="Black";
		}
	}

	public int getWinningNumner() {
		return winningNumner;
	}

	public String getWinningColor() {
		return winningColor;
	}

}
