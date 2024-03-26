package week2.day2;

public class Palindrome{
	public static void main(String[] args){

		//Initialize a String
		String text="malayalam";
		//Initialize an empty String
		String reverse = "";

		//Convert the string into charArry
		char[] eachCharacter= text.toCharArray();
		//Iterate the character from eachCharacter
		for(int i =eachCharacter.length-1;i>=0;i--){
			reverse=reverse+eachCharacter[i];
		}
		System.out.println(reverse);//malayalam

		if(reverse.equals(text)){
			System.out.println("The given String is palindrome");
		}else{
			System.out.println("not a palindrome");

		}
	}
}
//Here the length is 9 but it will store the index values 0 to 8
		//eachCharacter[0]=m
		//eachCharacter[1]=a
		//eachCharacter[2]=l
		//eachCharacter[3]=a
		//eachCharacter[4]=y
		//eachCharacter[5]=a
		//eachCharacter[6]=l
		//eachCharacter[7]=a
		//eachCharacter[8]=m