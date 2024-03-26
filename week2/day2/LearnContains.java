package week2.day2;

public class LearnContains {
public static void main(String[] args) {
	String text="Leaftaps - TestLeaf Automation Platform";
	String title="Leaftaps";
	
	if(text.contains(title)) {
		System.out.println("Partially match");
	}else {
		System.out.println("not match");
	}
}
}
