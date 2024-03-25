package week2.day1;

public class PrintDuplicate {
public static void main(String[] args) {
	int[] number= {1,2,3,4,5,6,7,8,1,2,3};
	
	//output 1,2,3
	
	for (int i = 0; i < number.length; i++) {
		for (int j = i+1; j < number.length; j++) {
			if(number[i]==number[j]) {
				System.out.println(number[i]);
				break;
			}
		}
	}
	
	
}
}
