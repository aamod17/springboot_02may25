package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream_Min_Max_Demo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Stream<Integer> stream1 = list1.stream();
		Optional<Integer> opt1 = stream1.max((Integer arg0, Integer arg1) -> {return arg0.compareTo(arg1);});
		Integer maxResult = opt1.orElseGet(() -> {return -1;});
		System.out.println("max Result: "+maxResult);
		System.out.println("=========================");
		Integer result = Stream.of(1,2,3,4,5,6,7,8,9,10,11).max((Integer arg0, Integer arg1) -> {return arg0.compareTo(arg1);}).orElse(-1);
		System.out.println("Max Result : "+result);
		System.out.println("==========================");
		Integer result3 = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14).min((Integer arg0, Integer arg1) -> {return arg0.compareTo(arg1);})
		                                           .orElseGet(() -> {return -1;});
		System.out.println("Min Result: "+result3);

	}

}
