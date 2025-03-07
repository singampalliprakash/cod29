package spring;

public class Employee {
	int empId;
	String empName;
	int empSal;
	static int a=10;
	Employee(int empId,String empName,int empSal){
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		
	}
	public String toString() {
		return this.empId +","+this.empName+","+this.empSal;
		
	}
	
	public static void main(String[] args) {
		Employee e=new Employee(101,"Sai",45000);
		Employee e1=new Employee(102,"prakash",46000);
		Employee e2=new Employee(103,"Ram",47000);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(Employee.a);
		

	}
	

}
class EmployeeClient {

	

}
