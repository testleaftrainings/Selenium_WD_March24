package week2.day2;

public class LearnString {
public static void main(String[] args) {
	String object="Test";
	//System.out.println(object);
	object="Leaf";
	System.out.println(object);
	
	//Difference between .equal and ==
	//a==b
	//== --> to compare memory address
	//.equal to compare the content of this string
	String text1="testleaf";
	String text2="testleaf";
	if(text1==text2) {
		System.out.println("Both are same");
	}else {
		System.out.println("Not equal");
	}
	int a=10;
	int b= 10;
	
	if(a==b) {
		System.out.println("A and b are equal");
	}
	
	
	
	String obj1=new String ("Testleaf");
	String obj2=new String ("Testleaf");
	
	if(obj1==obj2) {
		System.out.println("Both are same");
	}else {
		System.out.println("Not equal");
	}
	boolean equals1 = obj1.equals(obj2);
	System.out.println("equals1  "+equals1);
	if(obj1.equals(obj2)) {
		System.out.println(".equal Both are same");}
	else {
		System.out.println(".equal Both not  same");
	}
	
	
	
	
}
}
