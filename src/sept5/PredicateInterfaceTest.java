package sept5;

import java.util.function.Predicate;

public class PredicateInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Predicate<Integer> obj = (x) -> x > 18;
			
		if(obj.test(12)) {
			System.out.println("Eligible ");
		}
		else {
			System.out.println("Not eligible");
		}
	}

}
