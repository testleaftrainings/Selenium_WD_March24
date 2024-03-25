package week2.day1;

public class PrintBiggestNumber {
public static void main(String[] args) {
	 int a=400;
	 int b=781;
	 int c=1009;
	 
	 //Compare numbers a with b and a with c
	 // If my condition has true the if block will execute
	 if(a>b && a>c) {
		 System.out.println(a+"  a  is the biggest Number");
	 }else if (b>a && b>c) {
		 System.out.println(b+"  b  is the biggest Number");
	}else {
		 System.out.println(c+"  c  is the biggest Number");
	}
	 
	 
	 if(a!=b) {
		 System.out.println("Both are not equal");
	 }else {
		 System.out.println("Both are equal");
	 }
	 
}
}
