package week4.day4;

import org.testng.annotations.Test;

public class LearnInvocationCount {
    @Test
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
    @Test
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
    @Test(priority = -1)
	public void editLead() {
		System.out.println("Edit Lead");
	}
    @Test(invocationCount = 0)
	public void createLead() {
		System.out.println("Create Lead");
	}
}
//Addition
//Division
//Multiplication
//Subraction