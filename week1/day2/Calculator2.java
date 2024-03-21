package week1.day2;

public class Calculator2 {
	public int add() {
    int a=100;
    int b=50;
    int c=a+b;
    //System.out.println(c);
    return c;
	}
	public void sub(int total,int b) {
	
   int c=total-b;
    System.out.println(c);
}
	public static void main(String[] args) {
		//ClassName objectname =new ClassName() or Constructor();
		Calculator2 calc=new Calculator2();
		int total = calc.add();
		System.out.println(total);
		calc.sub( total,50);
	}
}
