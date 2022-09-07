package aug30;

import java.util.*;

class Student{
	String studentName;
	int rollNumber;
	Student(){
		
	}
	Student(String name, int rollno){
		studentName=name;
		rollNumber=rollno;
	}
	void show() {
		System.out.println("Student Name : "+ studentName);
		System.out.println("Student Roll Number : "+rollNumber);
	}
}

class Test extends Student{
	int mark1,mark2,mark3;
	Test(){
		
	}
	Test(int mark1,int mark2,int mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	void showMarks() {
		System.out.println("Subject 1 marks : " + mark1);
		System.out.println("Subject 2 marks : " + mark2);
		System.out.println("Subject 3 marks : " + mark3);
	}
	
	
}

interface Sports{
	int SPORTS_MARKS=90;
	void showSportswt();
}

class Result  extends Test implements Sports{
	
	
	
	Result(){
		
	}
	void totalMarks(int m1,int m2 ,int m3) {
		int t=m1+m2+m3+SPORTS_MARKS;
		System.out.println("Total Marks of a student is : "+t);
	}
	
	public void showSportswt() {
		System.out.println(" Sports mark : " + SPORTS_MARKS);
	}
}
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name and Roll number");
		String studentName = sc.nextLine();
		int rollNumber =  sc.nextInt();
		
		Student obj = new Student(studentName,rollNumber);
		
		System.out.println("ENter the marks of three subjects : ");
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		int mark3 = sc.nextInt();
		
		Test test= new Test(mark1,mark2,mark3);
		
		test.showMarks();
		
		Result res=new Result();;
		
		
		
		res.totalMarks(mark1,mark2,mark3);
		res.showSportswt();
		// TODO Auto-generated method stub

	}

}
