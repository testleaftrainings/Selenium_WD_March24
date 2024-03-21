package week1.day2;

public class Calculator {
	public void add(int a,int b) {
    int c=a+b;
    System.out.println(c);
	}
	public void sub() {
	int a=100;
    int b=50;
   int c=a-b;
    System.out.println(c);
}
	public static void main(String[] args) {
		//ClassName objectname =new ClassName() or Constructor();
		Calculator calc=new Calculator();
		calc.add(100,100);
		calc.add(10,10);
		calc.add(1000,1000);
		calc.add(1,1);
		
		//calc.sub();
	}
}
