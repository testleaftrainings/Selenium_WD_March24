package week4.day4;

import org.testng.annotations.Test;

public class LearnPriority {
    @Test(priority = -3)
	public void add() {
		System.out.println("Addition");
	}
    @Test
	public void sub() {
		System.out.println("Subraction");
	}
    @Test
	public void mul() {
		System.out.println("Multiplication");
	}
    @Test(priority = 2)
	public void div() {
		System.out.println("Division");
	}
}
//Addition
//Division
//Multiplication
//Subraction