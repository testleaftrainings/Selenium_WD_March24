package week5.day4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {
public static void main(String[] args) {
	//key        Value
	Map<Integer, String> employeeDetails=new HashMap<Integer, String>();
	
	
	employeeDetails.put(101,"Aravind");
	employeeDetails.put(null,"Raghu");
	employeeDetails.put(103,"Muthu");
	employeeDetails.put(104,"Ram");
	employeeDetails.put(105,"Saheel");
	
	employeeDetails.put(101,"Easwar");
	//To print all the element in map
	System.out.println(employeeDetails);
	//To get the size of the map
	System.out.println(employeeDetails.size());
	//To get the particular key
	String string = employeeDetails.get(104);
	System.out.println(string);
	//To remove particular key from entry set
	String remove = employeeDetails.remove(104);
	System.out.println(employeeDetails);
	
	//To erase all the entry set
//	employeeDetails.clear();
	System.out.println(employeeDetails);
	//Verify if the map is empty or not
	boolean empty = employeeDetails.isEmpty();
	System.out.println(empty);
	
	//
	boolean containsKey = employeeDetails.containsKey(107);
	System.out.println(containsKey);
	
	
	
}
}
