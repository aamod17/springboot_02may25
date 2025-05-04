package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstDemo {

	public static void main(String[] args) {
		
		// findFirst() method in sequential stream
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		Optional<Integer> opt1 = stream1.findFirst();
		Integer result = opt1.orElseGet(() -> {return -1;});
		System.out.println("Find First : "+result);
		System.out.println("====================");
		// findFirst() method in parallerl stream
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9).parallel();
		Optional<Integer> opt2 = stream2.findFirst();// returns first value
		Integer result2 = opt2.orElseGet(() -> {return -1;});
		System.out.println("Find First in parallel stream: "+result2);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list1.stream();// create sequential stream
		Stream<Integer> parallelStream1 = list1.parallelStream();// create parallel stream
		
	

	}

}
