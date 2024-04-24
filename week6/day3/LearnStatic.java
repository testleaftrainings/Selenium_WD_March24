package sample;

public  class LearnStatic {
	static int a=20;
	
	public static  void  add() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
	a=50;
		System.out.println(a);
		add();
	}
	
}
