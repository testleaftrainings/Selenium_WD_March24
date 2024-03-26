package week2.day2;

public class StringReverse2 {
public static void main(String[] args) {
	
		//INitialize a String
		String name ="Ravi";
		/// output ivaR
		//Converted String into characterArray
		char[] eachCharacter=name.toCharArray();

//		Ravi--> R,a,v,i   --> Here 4 character and length also 4
//		[0] -->R
//		[1] -->a
//		[2] -->v
//		[3] -->i

		//for(int i=0; i<eachCharacter.length;i++)
		for(int i=eachCharacter.length-1;i>=0;i--){
		System.out.println(eachCharacter[i]);
		}
		}
		}

