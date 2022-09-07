package sept5;
import  java.util.function.*;
public class ConsumerInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> obj =(x) -> System.out.println(x);
		obj.accept(5);
	}

}
