package tictactoe;

import java.util.ArrayList;

public class Grid {
	private String[][] array;
	private ArrayList<Player> players;
	
	public Grid() {
		this.array = new String[3][3];
		this.players = new ArrayList<Player>();
	}
	
	public void addPlayers(Player player) {
		players.add(player);
	}
	
	public ArrayList<Player> getPlayers() {
		return this.players;
	}
	
	public void clearGrid() {
		for(int y = 2; y >= 0; y--) {
			for(int x = 0; x < 3; x++) {
				this.array[x][y] = " ";
			}
		}
	}
	
	public void drawGrid() {
		for(int y = 2; y >= 0; y--) {
			if(y == 2) {
				System.out.println("忙式式式式式成式式式式式成式式式式式忖");
			} else {
				System.out.println("戍式式式式式托式式式式式托式式式式式扣");
			}

			for(int x = 0; x < 3; x++) {
				System.out.print("弛  " + array[x][y] + "  ");
				if(x == 2) {
					System.out.println("弛");
				}
			}
			if(y == 0) {
				System.out.println("戌式式式式式扛式式式式式扛式式式式式戎");
			}
		}
	}
	
	public void gridHelp() {
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("|     How to place the symbol?     |");
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
		System.out.println("In this 3x3 grid,");
		System.out.println("x-value starts from the left to the right");
		System.out.println("y-value starts from the bottom to the top");
		System.out.println();
		System.out.println("Example is shown below");
		
		String oSide = "o";
		String xSide = "x";
		String empty = " ";
		
		System.out.println("忙式式式式式成式式式式式成式式式式式忖");
		System.out.println("弛  " + empty  + "  弛  " + empty + "  弛  " + xSide + "  弛 3");
		System.out.println("戍式式式式式托式式式式式托式式式式式扣");
		System.out.println("弛  " + oSide  + "  弛  " + empty + "  弛  " + empty + "  弛 2");
		System.out.println("戍式式式式式托式式式式式托式式式式式扣");
		System.out.println("弛  " + empty  + "  弛  " + empty + "  弛  " + empty + "  弛 1");
		System.out.println("戌式式式式式扛式式式式式扛式式式式式戎");
		System.out.println("   1     2     3   ");
		System.out.println();
		System.out.println("The 'o' is placed on (1,2) position.");
		System.out.println("The 'x' is placed on (3,3) position.");
		System.out.println();
		System.out.println("That's it! Now, enjoy it!");
		System.out.println();
	}
	
	public boolean setGrid(String side, int x, int y) {
		if(this.array[x-1][y-1].equals("o") || this.array[x-1][y-1].equals("x")) {
			System.out.println("YOU CANNOT PLACE ON THIS PLACE!!!");
		} else {
			if(side.equals("o")) {
				this.array[x-1][y-1] = "o";
				return true;
			} else if (side.equals("x")) {
				this.array[x-1][y-1] = "x";
				return true;
			}
		}
		return false;
 
	}
	
	/**
	 * 
	 * @return	0	o wins
	 * 			1	x wins
	 * 			2	draw
	 */
	public int winDetection() {
		for(int y = 2; y >= 0; y--) { // horizontal
			if(array[0][y].equals(array[1][y]) && array[1][y].equals(array[2][y])) {
				if(array[0][y].equals("o")) {
					players.get(0).setWinStatus("Win");
					return 0;
				} else if(array[0][y].equals("x")) {
					players.get(1).setWinStatus("Win");
					return 1;
				}
			}
		}
		
		for(int x = 0; x < 3; x++) { // vertical
			if(array[x][0].equals(array[x][1]) && array[x][1].equals(array[x][2])) {
				if(array[x][0].equals("o")) {
					players.get(0).setWinStatus("Win");
					return 0;
				} else if(array[x][0].equals("x")) {
					players.get(1).setWinStatus("Win");
					return 1;
				}
			}
		}
		
		if(array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2])) {
			if(array[0][0].equals("o")) {
				players.get(0).setWinStatus("Win");
				return 0;
			} else if(array[0][0].equals("x")) {
				players.get(1).setWinStatus("Win");
				return 1;
			}
		}
		
		if(array[0][2].equals(array[1][1]) && array[1][1].equals(array[2][0])) {
			if(array[0][2].equals("o")) {
				players.get(0).setWinStatus("Win");
				return 0;
			} else if(array[0][2].equals("x")) {
				players.get(1).setWinStatus("Win");
				return 1;
			}
		}
		
		
		return 2;
	}
	
	
	
	public Player winner() {
		for(Player p : players) {
			if(p.getWinStatus().equals("Win")) {
				return p;
			}
		}
		return null;
	}
}
