package week3.day2;

public class Lead {

	public void getLead(int leadid) {
System.out.println("to get particular lead id");
	}
	public void getLead(int leadid,String name) {

	}
	public void getLead(long mobileNumber) {

	}public void getLead(String stdName,int rollNumber,long mobileNumber) {

	}public void getLead(int rollNumber,long mobileNumber,String stdName) {

	}
	public static void main(String[] args) {
		Lead lead=new Lead();
		lead.getLead(1007);
	}
}
