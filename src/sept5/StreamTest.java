package sept5;
import java.util.*;
import java.util.stream.*;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(8);
		list.add(7);
		list.add(4);
		list.add(9);
		
		Stream<Integer> streams = list.stream();
		
		
		long c= list.stream().filter(s->s>5).map(s->s.floatValue()).count();
		System.out.println(c);
		list.stream().filter(s->s<=5).forEach(s->System.out.println(s));
		List<String> ls = new ArrayList<String>();
		
		ls.add("Aakash");
		ls.add("manish");
		ls.add("Dhanush");
		ls.add("vilas");
		
		Stream<String> st= ls.stream();
		
		List<String> collector=st.filter(s->s.contains("an")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		collector.forEach(s->System.out.println(s));
		
		Stream<String> sr = ls.stream();
		
		boolean b=sr.allMatch(s->s.startsWith("v"));
		
		System.out.println(b);
		
		Stream<String> sc = ls.stream();
		Optional<String> ops= sc.sorted().reduce((s1,s2) -> s1+"#"+s2);
		
		ops.ifPresent(s->System.out.println(s));
		}

}

