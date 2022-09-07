package aug26;
import java.util.*;

class Member{
	String name;
	int age;
	long phonenum;
	String address;
	double salary;
	
	
	
	void printSalary() {
		System.out.println(salary);
	}
}

class Employee extends Member{
	String specialization;
	Employee(String name,int age,long phonenum,String address,double salary,String specialization){
		this.name=name;
		this.age=age;
		this.phonenum=phonenum;
		this.address=address;
		this.salary=salary;
		this.specialization=specialization;
		
	}
	void printEmployeeDetails() {
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Phone Number : "+ phonenum);
		System.out.println("Address : "+ address);
		System.out.println("Salary : "+ salary);
		System.out.println("Specialization: "+ specialization);
	}
}

class Manager extends Member{
	String dept;
	Manager(String name,int age,long phonenum,String address,double salary,String dept){
		this.name=name;
		this.age=age;
		this.phonenum=phonenum;
		this.address=address;
		this.salary=salary;
		this.dept=dept;
		
	}
	
	void printManagerDetails() {
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Phone Number : "+ phonenum);
		System.out.println("Address : "+ address);
		System.out.println("Salary : "+ salary);
		System.out.println("Dept : "+ dept);
	}
}

public class MainClassMember {

	public static void main(String[] args) {
		
		Employee emp = new Employee("aakash",22,89779,"Udupi",2000,"java");
		
		Manager manager = new Manager("XYZ",28,98067,"Udupi",7000,"ABC");
		
		//emp.printSalary();
		//manager.printSalary();
		emp.printEmployeeDetails();
		System.out.println();
		manager.printManagerDetails();
		// TODO Auto-generated method stub

	}

}
