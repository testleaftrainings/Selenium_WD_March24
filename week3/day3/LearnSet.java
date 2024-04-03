package week3.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	//Set<String> nameList=new LinkedHashSet<String>();
	//[Karthik, Sakthi, Sathish, Vinu, Ram]
	//Set<String> nameList=new HashSet<String>();
	//[Sathish, Vinu, Sakthi, Karthik, Ram]
	Set<String> nameList=new TreeSet<String>();
	nameList.add("Karthik");
	boolean add =nameList.add("Sakthi");
	System.out.println(add);
    nameList.add("Sathish");
	nameList.add("Vinu");
	nameList.add("Ram");
	boolean add2 = nameList.add("Sakthi");
	System.out.println(add2);
	System.out.println(nameList);
}
}
