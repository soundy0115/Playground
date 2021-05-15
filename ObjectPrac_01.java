import java.util.*;

public class ObjectPrac_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Tv tv = new Tv();
		
		System.out.println(tv.power);
		tv.powerOff();
		System.out.println(tv.power);
		System.out.print("What channel you want?: ");
		tv.channelSet(sc.nextInt());
		System.out.println(tv.channel);
		
		tv.volumeUp();
		System.out.println(tv.volume);
		sc.close();
	}

}

class Tv {
	boolean power = true;
	int volume = 0;
	int channel = 0;
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void channelSet(int setChannel) {
		channel = setChannel;
	}
	
	void powerOn() {
		power = true;
	}
	
	void powerOff() {
		power = false;
	}
}