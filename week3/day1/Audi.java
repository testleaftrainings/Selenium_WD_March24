package week3.day1;

public class Audi extends Car {

	public void openSunRoof() {
		System.out.println("Open Sun roof");
		
	}
	public static void main(String[] args) {
		
//ClassName objectName = keyword ClassName or Constructor name
		Audi objAudi=new Audi();
		objAudi.openSunRoof();
		objAudi.applyBreak();
		objAudi.applyGear();
		objAudi.soundHorn();
		objAudi.switchOnAc();
		
		
		
	}
}
