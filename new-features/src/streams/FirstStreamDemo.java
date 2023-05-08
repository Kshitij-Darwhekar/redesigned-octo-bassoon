package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamDemo {

	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Integer[] ar = {2,5,7,6,9,3,2,4};
		List<Integer> numbers = Arrays.asList(ar);
		
//		numbers.forEach(FirstStreamDemo::print);
	
//		Stream<Integer> str1 = numbers.stream();
//		str1.forEach(System.out::println);  //forEach is a terminal operation
		
		
//		numbers.stream().distinct().forEach(System.out::println);   // distinct is intermediate operation
//	
//		System.out.println(numbers.stream().distinct().count());   // Count is a terminal operation
	
		
//		System.out.println(numbers.stream().filter(n-> n > 5).count());  //filter is  intermediate operation
	
//		numbers.stream().distinct().sorted().forEach(System.out::println); //sorted is intermediate
	
//		System.out.println(numbers.stream().reduce(0,(n,m)-> n+m));
//		System.out.println(numbers.stream().reduce(0,Integer::sum));
		
		
//		numbers.stream().limit(5).forEach(System.out::println);
		
		IntStream istr = IntStream.range(1,99);
//		System.out.println(istr.skip(50).sum());
//		
//		IntStream istr2 = IntStream.of(5,7,6,9,3,2,4);
//		System.out.println(istr2.count());
//		System.out.println(istr2.sum());
//		
		IntSummaryStatistics statistics = istr.summaryStatistics();
		System.out.println(statistics);
	
	}
}
