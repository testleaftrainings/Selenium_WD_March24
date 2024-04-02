package week3.day2;

public class AxisBank extends RBI {
	public void withDraw() {
		System.out.println("This is Withdraw method");
		
	}
	
	public void saving() {
		
		System.out.println("This is child class method");
		super.saving();
		this.withDraw();
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.saving();
		bank.deposit();
	}
}
