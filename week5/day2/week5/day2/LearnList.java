package week5.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> obj=new ArrayList<String>();
	
	obj.add("Apple");
	obj.add("Mango");
	obj.add("Orange");
	obj.add("Apple");
	
	System.out.println(obj);
	
	String string = obj.get(0);
	System.out.println(string);
	
	//To get count of the list
	System.out.println(obj.size());
	
	
	String remove = obj.remove(1);
	System.out.println(obj);
	
	//obj.clear();
	System.out.println(obj);
	
	boolean contains = obj.contains("Orange");
	System.out.println("Existing same element  "+contains);
	
	
	
	Collections.sort(obj);
	boolean empty = obj.isEmpty();
	System.out.println(empty);
	
}
}
