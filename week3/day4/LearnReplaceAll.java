package week3.day4;

public class LearnReplaceAll {
public static void main(String[] args) {
	String text ="testLeaf1234@gmail.com";
	
//	String replaceAll = text.replaceAll("[0-9]", "");
	String replaceAll = text.replaceAll("[^a-zA-z]", "");
	System.out.println(replaceAll);
}
}
