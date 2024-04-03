package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ToPrintValuesInAscendingOrder {
public static void main(String[] args) {
	List<Integer> num=new ArrayList<Integer>();
	
		
	//I want to add the element in list
	num.add(20);
	num.add(10);
	num.add(5);
	num.add(87);
	num.add(30);
	num.add(14);
	num.add(100);
	System.out.println(num);
	
	Collections.sort(num);
	System.out.println(num);
	
	Collections.reverse(num);
	System.out.println(num);
	
	int size = num.size();
	System.out.println("Size is  "+size);
	
	
	Integer integer = num.get(0);
	System.out.println(integer);
	num.remove(1);
	
	System.out.println(num);
	boolean contains = num.contains(100);
	System.out.println(contains);
//	num.clear();
//	System.out.println(num);
//	
//	boolean empty = num.isEmpty();
//	System.out.println(empty);
}
}
