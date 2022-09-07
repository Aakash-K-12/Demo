package sept5;
import java.util.function.Function;
public class FunctionInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Function<Integer,Integer> obj = (x) ->x*x;
				
			System.out.println(obj.apply(4));
	}

}
