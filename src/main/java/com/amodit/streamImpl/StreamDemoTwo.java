package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoTwo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,16,19);
		
		Stream<Integer> s1 = list1.stream().limit(5);// It will print maximum 5 elements from start
		//s1.forEach(System.out::println);
		System.out.println("====================");
		//list1.stream().skip(6).forEach((Integer arg0) -> {System.out.println(arg0);}); // it will skip 6 elements from start
		System.out.println("======================");
		List<Integer> list2 = Arrays.asList(10,12,11);
		List<Integer> list3 = Arrays.asList(20,21,22);
		list2.stream().peek((Integer arg3) -> {System.out.println(arg3);}).forEach((Integer arg4) -> {System.out.println("----");});
		
		

	}

}
