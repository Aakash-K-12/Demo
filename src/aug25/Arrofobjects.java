package aug25;
import java.util.*;

class Student{
	int rollno;
	String name;
	
	void set_data() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter roll number and name ");
		rollno=sc.nextInt();
		name=sc.next();
		
	}
	
	void get_data(int a) {
		System.out.println("details of s["+a+"]");
		System.out.println("Name : "+name +"\nRoll number : "+ rollno);
	}
	
}
public class Arrofobjects {

	public static void main(String[] args) {
		
		Student [] s=new Student[3];
		s[0] = new Student();
		s[1] = new Student();
		s[2] = new Student();
		
		
		
		int i=0;
		while(i<3) {
			s[i].set_data();
			s[i].get_data(i);
			i++;
		}
		// TODO Auto-generated method stub

	}

}
