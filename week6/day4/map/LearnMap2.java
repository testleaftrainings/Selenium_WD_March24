package week5.day4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap2 {
public static void main(String[] args) {
	//key        Value
	Map<Integer, String> employeeDetails=new LinkedHashMap<Integer, String>();
	
	
	employeeDetails.put(101,"Aravind");
	employeeDetails.put(102,"Raghu");
	employeeDetails.put(103,"Muthu");
	employeeDetails.put(104,"Ram");
	employeeDetails.put(105,"Saheel");
	
	employeeDetails.put(101,"Easwar");
	
	Set<Entry<Integer, String>> entrySet = employeeDetails.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		//System.out.println(entry);
		//System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	
	
}
}
