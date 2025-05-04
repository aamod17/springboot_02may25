package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream1 = list1.stream();
		Integer result = stream1.reduce((Integer arg0, Integer arg1) -> {return arg0 * arg1;})
		                            .orElseThrow(() -> {throw new ArithmeticException("Number not Found Exception");});
		//System.out.println(result);
		System.out.println("===============");
		Integer val = Stream.of(1,2,3).reduce(3, (Integer arg0, Integer arg1) -> {return arg0 * arg1;});
		System.out.println(val);
		System.out.println("==============");
		Stream<Integer> stream2 = Stream.of(10,20,30,40,50);
		Long count = stream2.count();
		System.out.println(count);

	}

}
