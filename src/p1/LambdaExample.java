package p1;

interface LambdaTest{
	void add(int x,int y);
	default void mul(int a,int b) {
		System.out.println(a*b);
	}
}
public class LambdaExample {

	public static void main(String[] args) {
		
		LambdaTest lt=(x,y)->{
			System.out.println("Lambda Example");
			System.out.println(x+y);
		};
		
		lt.add(5, 6);
		lt.mul(4, 98);
		// TODO Auto-generated method stub

	}

}
