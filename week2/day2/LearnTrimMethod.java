package week2.day2;

public class LearnTrimMethod {
public static void main(String[] args) {
	
	String text="  test    leaf  ";
	String trim = text.trim();
	System.out.println(trim);
	
	String email="testleaf12345@gmail.com";
	 //String replaceAll = email.replaceAll("[0-9]", "");
	String replaceAll = email.replaceAll("[^a-zA-z]", "");
	 System.out.println(replaceAll);
	 
	 String t1="test";
	 char charAt = t1.charAt(3);
	 System.out.println(charAt);
}
}
