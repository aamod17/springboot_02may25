package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		
		List<Integer> myList1 = Arrays.asList(3,7,8,1,2,3,3,1,4,4);
		List<Integer> myList2 = Arrays.asList(22,13,12,12,11,5,11,5,6,7,9,1,2,4);
		// use sorted() method
		Stream<List<Integer>> s1 = Stream.of(myList1);
		s1.sorted().distinct().forEach((List<Integer> arg0) -> {System.out.println(arg0);});
		System.out.println("========");
		Stream.of(6,4,3,1,11,18,1,2,3,4).sorted().distinct().forEach((Integer arg1) -> {System.out.println(arg1);});
		
		System.out.println("==========");
		Stream<List<Integer>> s2 = Stream.ofNullable(myList2);
		s2.distinct().forEach((List<Integer> arg2) -> {System.out.println(arg2);});
		System.out.println("+++++++++++++++");
		myList1.stream().sorted().distinct().forEach(System.out::println);

	}

}
