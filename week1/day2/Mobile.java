package week1.day2;



public class Mobile {

	public void makeCall() {
		System.out.println("Public access modifiers");
	}
	private void photos() {
		System.out.println("Private access modifiers");
	}
	
	protected void payment() {
		System.out.println("Protected access modifiers");
	}
	  void sendMsg() {
		System.out.println("Default access modifiers");

	}
	  
	  public static void main(String[] args) {
		  Mobile myMobile=new Mobile();
		  myMobile.makeCall();
		  myMobile.sendMsg();
		  myMobile.payment();
		  myMobile.photos();
	}
	
}
