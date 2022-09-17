package tictactoe;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grid gr = new Grid();
		Messages msg = new Messages();
		
		
		System.out.println("������������������������������������������������������������������������");
		System.out.println("| Welcome to the Tic-Tac-Toe game! |");
		System.out.println("������������������������������������������������������������������������");
		
		gr.gridHelp();
		gr.clearGrid();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player 1's name: ");
		String p1Name = sc.nextLine();
		System.out.print("Enter Player 2's name: ");
		String p2Name = sc.nextLine();
		
		System.out.println("������������������������������������������������������������������������");
		System.out.println("|          Side Selection          |");
		System.out.println("������������������������������������������������������������������������");
		System.out.println("There are [o] and [x]. [o] side will go first.");
		System.out.print("Choose Player 1's side: ");
		String p1Side = sc.nextLine();
		String p2Side;
		if(p1Side.equals("o")) {
			p2Side = "x";
		} else {
			p2Side = "o";
		}
		
		Player p1 = new Player(p1Name, p1Side);
		Player p2 = new Player(p2Name, p2Side);
		gr.addPlayers(p1);
		gr.addPlayers(p2);
		
		System.out.println(p1.getName() + " is " + p1.getSide() + ".");
		System.out.println(p2.getName() + " is " + p2.getSide() + ".");
		
		System.out.println("������������������������������������������������������������������������");
		System.out.println("|          !!Game Start!!          |");
		System.out.println("������������������������������������������������������������������������");
		

		int count = 0;
		while(count < 9) {
			gr.drawGrid();
			
			if(count % 2 == 0) {
				msg.turnMessageP1();
				int[] input = msg.gridInput(p1);
				boolean result = gr.setGrid(gr.getPlayers().get(0).getSide(), input[0], input[1]);
				if(result == false) {
					count--;
				}
			} else {
				msg.turnMessageP2();
				int[] input = msg.gridInput(p2);
				boolean result = gr.setGrid(gr.getPlayers().get(1).getSide(), input[0], input[1]);
				
				if(result == false) {
					count--;
				}
			}
			
			if(gr.winDetection() == 0) {
				gr.drawGrid();
				count = 9;
			} else if(gr.winDetection() == 1) {
				gr.drawGrid();
				count = 9;
			} else {
				count++;
			}
			
		}
		if(gr.winDetection() != 0 && gr.winDetection() != 1) {
			gr.getPlayers().get(0).setWinStatus("Draw");
			gr.getPlayers().get(1).setWinStatus("Draw");
		}

		msg.endingMsg(gr.winner());
		
		sc.close();
	}

}
