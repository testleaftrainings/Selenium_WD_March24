package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueNumber {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,7,8,1,2,3};
	//duplicate 1,2,3,
	
	Set<Integer> number=new LinkedHashSet<Integer>();
	
	//Iterate the values from num
	for (int i = 0; i < num.length; i++) {
		//add the values in set
		number.add(num[i]);
	}
	
	//print unique number
	System.out.println(number);
}
}
