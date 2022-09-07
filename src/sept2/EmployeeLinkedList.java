package sept2;

import java.util.*;




class Employee {
	String name;
	int id;
	float salary;

	Employee(String name, int id, float salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

}
public class EmployeeLinkedList {
	
	static Scanner sc = new Scanner(System.in);
	static LinkedList<Employee> employeeLinkedList = new LinkedList<Employee>();
	static Employee e;

	// insert method
	static void insert() {
		System.out.println("enter the employee name");
		String name = sc.next();
		System.out.println("enter the employee id");
		int id = sc.nextInt();
		System.out.println("enter the employee salary");
		float salary = sc.nextFloat();

		employeeLinkedList.add(e = new Employee(name, id, salary));

	}

	// delete method
	static void delete() {
		System.out.println("Enter the id to be deleted");
		int pos = sc.nextInt();
		Employee ref = null;
		for (Employee i : employeeLinkedList) {
			if (i.id == pos) {
				ref = i;
			}
		}
		if (ref != null) {
			employeeLinkedList.remove(ref);
		} else {
			System.out.println("Id not found");
		}
	}

	// display method
	static void display() {
		if (employeeLinkedList.size() == 0) {
			System.out.println("No Records Found ");
		} else {
			System.out.println("ID \t Name \t Salary");
			for (Employee i : employeeLinkedList) {
				System.out.print(i.id + "\t");
				System.out.print(i.name + "\t");
				System.out.print(i.salary + "\t");
				System.out.println();
			}
		}
	}

	// search method
	static void search() {
		System.out.println("Enter the id of the employee to be searched");
		int id = sc.nextInt();
		Employee ref = null;
		for (Employee i : employeeLinkedList) {
			if (i.id == id) {
				ref = i;
			}
		}
		if (ref != null) {
			System.out.println("Record found:");
			System.out.println("ID \t Name \t Salary");
			System.out.print(ref.id + "\t");
			System.out.print(ref.name + "\t");
			System.out.print(ref.salary + "\t");
			System.out.println();
		} else {
			System.out.println("Record not found");
		}
	}

	// update method
	static void update() {
		System.out.println("Enter the id of the employee to be updated");
		int pos = sc.nextInt();
		System.out.println("Enter the parameter to be updated");
		System.out.println("1:name \n 2:id \n 3:salary");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter the name");
			String n = sc.next();
			for (Employee i : employeeLinkedList) {
				if (i.id == pos) {
					i.name = n;
				}
			}
			break;
		case 2:
			System.out.println("Enter the id");
			int ID = sc.nextInt();
			for (Employee i : employeeLinkedList) {
				if (i.id == pos) {
					i.id = ID;
				}
			}
			break;

		case 3:
			System.out.println("Enter the salary");
			float sal = sc.nextFloat();
			for (Employee i : employeeLinkedList) {
				if (i.id == pos) {
					i.salary = sal;
				}
			}
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}
	
	static void  maxsalary() {
		
		Employee obj=employeeLinkedList.get(0);
		
		float maxsal=obj.salary;
		Employee ref=obj;
		
		for(Employee i : employeeLinkedList) {
			if(i.salary>maxsal) {
				maxsal=i.salary;
				ref=i;
		}
		}
		System.out.println("Details of Employee with maximum salary");
		System.out.println("Name\t Id\t Salary\t");
		System.out.println(ref.name+"\t"+ref.id+"\t"+ref.salary);
	}
	
	public static void main(String[] args) {
		
		
		while (true) {
			System.out.println("Enter the choice");
			System.out.println("1: Insert a record \n2: Delete a record \n3: Display \n4:Search \n5:Update \n6:Maximum Salary \n7:Exit");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				insert();
				break;

			case 2:
				delete();
				break;

			case 3:
				display();
				break;

			case 4:
				search();
				break;

			case 5:
				update();
				break;

			case 6:maxsalary();
				break;
				
			case 7:return;
			
			default:
				System.out.println("Invalid Input");
			}
		}
		// TODO Auto-generated method stub

	}

}


