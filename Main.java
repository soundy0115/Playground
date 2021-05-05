package lottery_kor;

import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many random numbers do you need?: ");
		int numOfNums = sc.nextInt();
		int[] randomArr = new int[numOfNums];

		System.out.print("What is the minimum number?: ");
		int min = sc.nextInt();
		
		System.out.print("What is the maximum number?: ");
		int max = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < randomArr.length; i++) {
			
			int test = (int) (Math.random() * 100); // test 변수로 min~max 사잇 값을 정한다
			
			if(test >= min && test <= max) { // 범위 정하기
				randomArr[i] = test; //범위 안에 들어왔으니까 random[i]에 넣어줌
				for(int j = 0; j <= i - 1; j++) { // i 보다 작은 index들을 0~i-1까지 돌려줌
					if(randomArr[i] == randomArr[j]) { // 만약 i보다 작은 index에서 중복값이 있으면
						i--; // i값이 있는 해당 인덱스를 다시 설정하여 반복문을 다시 중복값이 없을 때까지 돌려줌
					}
				}
			} else {
				i--; // 범위 밖에 있으니까 random[i]값을 다시 설정해줌
			}

		}
		
		Arrays.sort(randomArr); // 정렬

		System.out.print("\nHere are your lucky numbers\n");
		for(int i = 0; i < randomArr.length; i++) {
			if(i != randomArr.length - 1) {
				System.out.print(randomArr[i] + ", ");					
			} else {
				System.out.print(randomArr[i]);
			}

		}
	}
	
}
