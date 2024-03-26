package week2.day2;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the input");
	int nextInt = scan.nextInt();
	//int number=13;
	int count=0;
	for (int i = 1; i <=13; i++) {
		if(nextInt%i==0) {
			count=count+1;
		}
	}
	if(count==2) {
		System.out.println("The given number is primeNumber");
	}else {
		System.out.println("The given number is not a primeNumber");
	}
	
}
}
