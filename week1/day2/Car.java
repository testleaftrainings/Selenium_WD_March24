package week1.day2;



public class Car {

	public void driveCar() {
		System.out.println("Drive a car carefully");
	}
	public void applyBreak() {
		System.out.println("Apply Break");	
	}
	public void sounHorn() {
		System.out.println("Sound horn");
	}
	public static void main(String[] args) {
//ClassName objectName = new className() or Constructor();
		Car myCar=new Car();
		myCar.driveCar();
		myCar.applyBreak();
		myCar.sounHorn();
	}


	
}
