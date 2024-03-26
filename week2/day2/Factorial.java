package week2.day2;

public class Factorial {
public static void main(String[] args) {
	//5*4*3*2*1 120
	int fact=1;
	for (int i =5;i>=1; i--) {
		fact=fact*i;
		//fact=1*5  5
		 //5=5*4 =20
		  //20 =20*3 =60
		// 60 =60*2 =120
		//120 =120*1 =120
		
		
		//System.out.println(fact);
	}System.out.println(fact);
}
}
