/**
 * 
 */
package week2.day2;

import java.util.Arrays;

/**
 * @author Aravinthan R
 *
 */
public class FindMissingNumber {
public static void main(String[] args) {
	
	//Initialize an Array
	int[] num= {1,8,5,2,7,3,4};
	//Missing Number -->6
	
	Arrays.sort(num);
	//1,2,3,4,5,7,8
	
	//Iterate the values from num
	for (int i = 0; i < num.length; i++) {
		int j=i+1;
		//Check if the condition is match 
		if(num[i]!=j) {
			//Print the values
			System.out.println(j);
			break;
		}
	}
	
	
	
	
	
	
}
	
	
	
	
}
