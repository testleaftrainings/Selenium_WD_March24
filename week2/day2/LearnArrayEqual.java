package week2.day2;

import java.util.Arrays;

public class LearnArrayEqual {
public static void main(String[] args) {
	String text1="act";
	String text2 ="cat";
	
	
	char[] charArray = text1.toCharArray();
	char[] charArray2 = text2.toCharArray();
	Arrays.sort(charArray);
	Arrays.sort(charArray2);
	
	if(Arrays.equals(charArray, charArray2)) {
		System.out.println("both are equal");
	}else {
		System.out.println("Not equal");
	}
}
}
