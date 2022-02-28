package montyHall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MontyHall {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		// put the car in the random door
		

		int second = 0;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many games?: ");
		long numberOfGames = Long.parseLong(bf.readLine());
		long success = 0;

		for(long i = 0; i < numberOfGames; i++) {
			char[] doorArr = new char[3];			
			for(int j = 0; j < doorArr.length; j++) {
				doorArr[j] = 'e';
			}
			doorArr[random.nextInt(3)] = 'c';
			if(doorArr[0] == 'c') { // first door is car
				second = random.nextInt(2) + 1;
			} else if(doorArr[1] == 'c') { // 2nd door is car
				second = 1;
			} else if(doorArr[2] == 'c') {
				second = 2;
			}

			if(doorArr[second] == 'c') {
				success++;
			}
		}
		System.out.println("You selected car for " + success + " times!");
		System.out.println("Your win probability is " + (double)((double)success/(double)numberOfGames)*100 + "%");
	}

}
