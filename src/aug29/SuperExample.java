package aug29;
import java.util.*;
class A {
	int i;
	A(int i){
		System.out.println("Constructor A"+i);
	}
	void show() {
		System.out.println("Inside A"+i);
	}
}

class B extends A{
	int j=12;
	B(int a , int b){
		super(a);
		b=j;
	}
	void show() {
		System.out.println(" Inside B"+j);
	}
} 
class C extends A{
	int k=15;
	C(int c){
		super(c);
		
		
	}
	void show() {
		System.out.println("Inside C"+k);
	}
} 
public class SuperExample {

	public static void main(String[] args) {
		
		C c = new C(3);
		
		// TODO Auto-generated method stub

	}

}
