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
			
			int test = (int) (Math.random() * 100); // test ������ min~max ���� ���� ���Ѵ�
			
			if(test >= min && test <= max) { // ���� ���ϱ�
				randomArr[i] = test; //���� �ȿ� �������ϱ� random[i]�� �־���
				for(int j = 0; j <= i - 1; j++) { // i ���� ���� index���� 0~i-1���� ������
					if(randomArr[i] == randomArr[j]) { // ���� i���� ���� index���� �ߺ����� ������
						i--; // i���� �ִ� �ش� �ε����� �ٽ� �����Ͽ� �ݺ����� �ٽ� �ߺ����� ���� ������ ������
					}
				}
			} else {
				i--; // ���� �ۿ� �����ϱ� random[i]���� �ٽ� ��������
			}

		}
		
		Arrays.sort(randomArr); // ����

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
