package sept5;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.stream.Collectors; 
class Employee {
	String name;
	int id;
	public float salary;

	Employee(String name, float salary, int id) {
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	float getSalary() {
		return salary;
	}
}

public class EmployeeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e;
		List<Employee> employeeList = new ArrayList<Employee>();
		System.out.println("Enter the number of employee");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			System.out.println("Enter the id");
			int id = sc.nextInt();
			employeeList.add(e = new Employee(name, salary, id));
		}

		while (true) {
			System.out.println("Enter the choice");
			System.out.println(
					"1:employee with  salary >15000  \n2:Employee name starts with letter ' V' \n3:MAX salary \n4:the total number of empoyees \n5: employee name length more than four \n6:Sort ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				/*
				long c = employeeList.stream().filter(s -> s.salary > 15000).count();
				if (c > 0) {
					employeeList.stream().filter(s -> s.salary > 15000).forEach(s -> System.out.println(s.name));
				} else {
					System.out.println("Not found");
				}
				
				*/
				
				List<String> nameList = employeeList.stream().filter(s->s.salary>15000).map(p->p.name).collect(Collectors.toList());
				if(nameList.size()>0) {
					nameList.stream().forEach(s->System.out.println(s));
				}else {
					System.out.println("Not found");
				}
				
				break;
			case 2:
				//employeeList.stream().filter(s -> s.name.startsWith("V")).forEach(s -> System.out.println(s.name));
				
				List<String> nameListStartsWithV = employeeList.stream().filter(s->s.name.startsWith("V")).map(p->p.name).collect(Collectors.toList());
				
				if(nameListStartsWithV.size()>0) {
					nameListStartsWithV.stream().forEach(s->System.out.println(s));
				}else {
					System.out.println("Not found");
				}
				
				break;
			case 3:

				Employee max = employeeList.stream().max(Comparator.comparing(s -> s.salary)).get();
				System.out.println(max.salary);

				break;
			case 4:
				long count = employeeList.stream().count();
				System.out.println(count);
				break;

			case 5:
				long c1 = 0;

				if (c1 > employeeList.stream().filter(i -> i.name.length() > 4).count()) {
					employeeList.stream().filter(i -> i.name.length() > 4).forEach(s -> System.out.println(s));
				} else {
					System.out.println("Not Found");
				}

				break;

			case 6:
				employeeList.stream().sorted(Comparator.comparing(s -> s.name))
						.forEach(s -> System.out.println(s.name + "\t" + s.id + "\t" + s.salary));
				break;
			default:
				return;
			}
		}

	}

}
