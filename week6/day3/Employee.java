package sample;

public class Employee {
	int employeeNumber;
	String employeeName;
	double employeeSalary;
	boolean isPresent;
	 Employee(){
		System.out.println("This is a default Constructor");
	}
	 public void sub() {
		 
	 }
	  
	 Employee(int employeeNumber ,String employeeName ,double employeeSalary){
		 this();
			System.out.println("This is a Parameterized Constructor");
			this. employeeNumber=employeeNumber;
			this.employeeName=employeeName;
		 this.employeeSalary=employeeSalary;
		//	System.out.println(employeeNumber);
			//System.out.println(employeeName);
//			System.out.println(employeeSalary);
		}
public static void main(String[] args) {
	Employee emp=new Employee(10234,"Aravind",2387632.34324321);
	System.out.println(emp.employeeNumber);
	System.out.println(emp.employeeName);
	System.out.println(emp.employeeSalary);
//	System.out.println(emp.isPresent);
}
}
