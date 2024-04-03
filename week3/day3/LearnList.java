package week3.day3;

import java.util.ArrayList;
import java.util.List;


public class LearnList {
public static void main(String[] args) {
	List<String> obj=new ArrayList<String>();
	
	//I want to add the element in list
	obj.add("Karthik");
	obj.add("Sakthi");
	obj.add("Sathish");
	obj.add("Vinu");
	obj.add("Ram");
	obj.add("Sakthi");
	//obj.add(0, "Aravind"); example for  method overloading
	obj.add("Raghu");
	System.out.println(obj);
	
	//foreach
	//datatype  localvariable fromvarible
	for (String num : obj) {
	//	System.out.println(num);
	}
	
	///for loop
	for (int i = 0; i < obj.size(); i++) {
		System.out.println(obj.get(i));
	}
	
}
}
