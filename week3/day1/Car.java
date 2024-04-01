package week3.day1;

public class Car extends Vehicle {

	public void applyGear() {
		System.out.println("Apply gear");
	}
	public void switchOnAc() {
		System.out.println("Switch on AC");
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.switchOnAc();
		obj.applyGear();
		obj.applyBreak();
		obj.soundHorn();
		}
}
