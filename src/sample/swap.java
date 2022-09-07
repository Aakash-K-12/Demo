package sample;
import java.util.*;
public class swap {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println("first num ="+a);
		System.out.println("second number ="+b);
		// TODO Auto-generated method stub

	}

}
