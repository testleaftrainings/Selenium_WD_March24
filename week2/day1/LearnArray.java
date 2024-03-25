package week2.day1;

public class LearnArray {
public static void main(String[] args) {
	
	int number[]= {10,20,30,40,50};
	
	//To get the size of an Array 
	int len = number.length;
	System.out.println(len);
	
	int a =10;
	//System.out.println(number);
	//Iterate the values from number
	                   //5
	for (int i = 0; i < len; i++) {
	//	System.out.println(number[i]);
	}
	
	           //5 -1 -->4
	for (int i = number.length-1;i>0; i--) {
		System.out.println(number[i]);
	}
}
}
