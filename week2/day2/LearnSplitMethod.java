package week2.day2;

public class LearnSplitMethod {
public static void main(String[] args) {
	String text="I           like chicken briyani";
	
	String[] split = text.split("\\s+");
	
	//to get the  length
	int length = split.length;
	System.out.println(length);
	
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	
	
}
}
