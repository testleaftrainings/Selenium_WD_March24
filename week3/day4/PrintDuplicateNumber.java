package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumber {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,7,8,1,2,3};
	//duplicate 1,2,3,
	
	Set<Integer> number=new LinkedHashSet<Integer>();
	boolean add = number.add(1);
	System.out.println(add);
	boolean add2 = number.add(1);
	System.out.println(add2);
	//Iterate the values from num
	for (int i = 0; i < num.length; i++) {
		//not added in set
		if(!number.add(num[i])) {
		//add the values in set
		System.out.println(num[i]);
	}
	
	//print unique number
	//System.out.println(number);
}
}
}