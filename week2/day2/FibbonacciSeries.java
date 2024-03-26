package week2.day2;

public class FibbonacciSeries {
public static void main(String[] args) {
	int firstNumber =0;
	int secondNumber=1;
	//Initialize the variable as sum=0
	int sum=0;
	int len=8;
	//if you are perform addition and subraction you should initialize the temp variabe as 0
	//if you are perform multiplication and division you should initialize the temp variabe as 1
	for(int i=0; i<=len;i++){
// 0,1,1,2,3,5,8,13,21..
	sum=firstNumber+secondNumber;
	System.out.println(sum);
	firstNumber=secondNumber;
	secondNumber=sum;
	}
	}
}

