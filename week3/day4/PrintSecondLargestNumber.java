package week3.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintSecondLargestNumber {
public static void main(String[] args) {
	int[] num= {1,7,2,5,3,4,7,8,4,7,2,9,10};
	//7,2,4
	//output 7
	
	Set<Integer> removeDuplicate=new TreeSet<Integer>();
	
	//iterate the values from num
	for (int i = 0; i < num.length; i++) {
		//add the values in set
		removeDuplicate.add(num[i]);
	}
	//print set values
	System.out.println(removeDuplicate);
	//1,2,3,4,5,6,7
	
	//create an empty list, pass list object name in set constructor
	List<Integer> secondLargestNumber =new ArrayList<Integer>(removeDuplicate);
	//1, 2, 3, 4, 5, 7, 8]
	//0,1, 2,  3, 4, 5
	//Print Second Largest Number
	System.out.println(secondLargestNumber.get(secondLargestNumber.size()-2));
	
}
}
