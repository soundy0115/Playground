
import java.util.*;

public class RandomMatch extends Member{

	public RandomMatch(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member("Juhan");
		Member m2 = new Member("Shoshin");
		Member m3 = new Member("Aadarsh");
		Member m4 = new Member("Ismael");
		Member m5 = new Member("Sherif");
		Member m6 = new Member("Daniel");
		
		ArrayList<Member> mem = new ArrayList<Member>(6);
		mem.add(m1);
		mem.add(m2);
		mem.add(m3);
		mem.add(m4);
		mem.add(m5);
		mem.add(m6);

		ArrayList<String> questions = new ArrayList<String>(6);
		questions.add("Q1");
		questions.add("Q2");
		questions.add("Q3");
		questions.add("Q4");
		questions.add("Q5");
		questions.add("Spokesperson");
		
		Collections.shuffle(questions);

		for(int i = 0; i < mem.size(); i++) {
			mem.get(i).setRole(questions.get(i));
			System.out.println(mem.get(i).getName() + ", your role is: " + mem.get(i).getRole());
		}
		
	}

}