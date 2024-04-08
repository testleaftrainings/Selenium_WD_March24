package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String[] companyName={"HCL", "Wipro", "Aspire Systems", "CTS"};


		List<String> companyList=new ArrayList<String>();
		//companyList.add("HCL");
		//Iterate the values from  companyName
		for (int i = 0; i < companyName.length; i++) {
			//we have to add the values in add
			companyList.add(companyName[i]);
		}

		//print the list
		System.out.println(companyList);
		//sort the values
		Collections.sort(companyList);

		//print the list it will print in Ascending order
		System.out.println(companyList);

		//sort the values
		Collections.reverse(companyList);

		//print the list, it will print in descending order
		System.out.println(companyList);
	}
}
