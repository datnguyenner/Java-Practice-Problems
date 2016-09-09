package RouletteGame;

public class Player {
	
	private boolean playerWin;
	private int totalBet = 0;
	private String betColor;
	
	Table table = new Table();
	
	public void betColor(String betColor){
		this.betColor = betColor;
		
	}
	public int placeBet(){
		return 10;
	}
	
	public void determinePlayerBet(String winningColor){
		
		if(this.betColor.equalsIgnoreCase(winningColor)){
			playerWin = true;
		}else{
			playerWin = false;
		}
		
	}
	
	public boolean getPlayerWin(){
		return playerWin;
	}

	public int getTotalBet() {
	
		return totalBet;
	}

	public void setTotalBet(int totalBet) {
		this.totalBet = totalBet;
	}
	
	
}
