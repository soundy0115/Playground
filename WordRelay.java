import java.io.*;

public class WordRelay {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean repeat = true;
		int count = 0;
		bw.write("Input the first word: ");
		bw.flush();
		bw.newLine();
		String b = br.readLine();
		while(repeat == true) {
			bw.write("Input word:");
			bw.flush();
			String a = br.readLine();
			
			if(a.charAt(0) == b.charAt(b.length() - 1)) {
				count = count + 1;
				bw.write("You write \"" + a + "\". Great!");
				bw.newLine();
				bw.write("The count is " + count + " now.");
				bw.newLine();
				bw.newLine();
				bw.flush();
				b = a;

			} else{
				repeat = false;
				bw.write("Wrong. Game over.");
				bw.newLine();
				bw.write("Final Score is : " + count);
				bw.flush();
			}

		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}
