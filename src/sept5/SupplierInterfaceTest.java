package sept5;
import java.util.*;
import java.util.function.*;
public class SupplierInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> obj =()-> new Date();
		Date x= obj.get();
		System.out.println(x);
	}

}
