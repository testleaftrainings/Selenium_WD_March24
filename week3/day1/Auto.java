package week3.day1;

public class Auto  extends Vehicle{
	public void kickStarter() {
		System.out.println("Handle starter");

	}
public static void main(String[] args) {
	Auto obj=new Auto();
	obj.kickStarter();
	obj.applyBreak();
	obj.soundHorn();
	
}
}
