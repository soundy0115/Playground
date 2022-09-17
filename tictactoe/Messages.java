package tictactoe;

import java.util.Scanner;

public class Messages {
	Grid gr = new Grid();
	Scanner sc = new Scanner(System.in);
	
	public void turnMessageP1() {
		System.out.println("Player 1's turn.");
	}
	
	public void turnMessageP2() {
		System.out.println("Player 2's turn.");
	}
	
	public int[] gridInput(Player player) {
		int[] input = new int[2];
		System.out.println("Where will you place the " + player.getSide() + "?");
		System.out.print("Enter x-position: ");
		input[0] = sc.nextInt();
		System.out.print("Enter y-position: ");
		input[1] = sc.nextInt();
		
		return input;
		
	}
	
	public void endingMsg(Player p) {
		System.out.println("The game ended.");
		System.out.println("The winner is " + p.getName() + ".");
		System.out.println("Congratualtions!");
	}
	
}
