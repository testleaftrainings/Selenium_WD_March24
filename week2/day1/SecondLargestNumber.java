package week2.day1;

import java.util.Arrays;

public class SecondLargestNumber {
public static void main(String[] args) {
	int[] num= {1,8,3,5,0,7,9};
	
	//out out --8
	
	//we have sort the arrays by using Arrays.sort()
	Arrays.sort(num);//0,1,3,5,7,8,9
	
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
	
	System.out.println(num[num.length-2]);
	
	
}
}
