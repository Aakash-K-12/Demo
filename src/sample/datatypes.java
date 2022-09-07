package sample;
import java.util.Scanner;
public class datatypes {

	public static void main(String[] args) {
		String s;
		int i;
		float f;
		char c;
		Scanner sc = new Scanner(System.in);
		int []  arr;
		int [][] arr1 = new int[2][2];
		/*
		System.out.println("Enter a string");
		s=sc.nextLine();
		System.out.println("enter a integer");
		i=sc.nextInt();
		System.out.println(" enter  a float number");
		f=sc.nextFloat();
		System.out.println("enter a character");
		c= sc. next().charAt(0);
		
		System.out.println("String entered : "+s);
		System.out.println("Integer entered : "+ i);
		System.out.println("Float number : "+ f);
		System.out.println(" Character entered :"+c);
		
		
		System.out.println(" enter the elements of 1D array");
		for(i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the elements are");
		for(i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		*/
		System.out.println("Enter the elements of a 2D array");
		for(i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Entered elements are");
		for (i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
