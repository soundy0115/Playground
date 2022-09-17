package tictactoe;

public class Player {
	private String name;
	private String side; // o/x - small letter
	private String winStatus;
	
	public Player(String name, String side) {
		this.name = name;
		this.side = side;
		this.winStatus = "draw";
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSide() {
		return this.side;
	}
	
	public String getWinStatus() {
		return this.winStatus;
	}
	
	public void setWinStatus(String winStatus) {
		this.winStatus = winStatus;
	}
}
