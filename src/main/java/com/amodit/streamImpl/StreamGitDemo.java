package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamGitDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(10,2,1,5,4,9,7,8,6,11);
		// create stream
		Stream<Integer> myStream1 = list1.stream();
		// perform some intermediate operation. it is optional
		// perform terminal operation
		//myStream1.forEach((Integer i) -> {System.out.println(i);});
		System.out.println("=====================");
		// create a parallel stream
		Stream<Integer> myParStream1 = list1.parallelStream();
		//myParStream1.forEach((Integer i1) -> {System.out.println(i1);});
		System.out.println("=================");
		List<Integer> list2 = Arrays.asList(1,2,3);
		List<Integer> list3 = Arrays.asList(10,13,9);
		
		List<List<Integer>> list4 = Arrays.asList(list2,list3);
		// this will print the list object
		//list4.stream().forEach((List<Integer> arg0) -> {System.out.println(arg0);});
		// now i want to print the data only
		// use flatMap() method
	    Stream<List<Integer>> m1 = list4.stream();
	    Stream<Integer> obj0 = m1.flatMap((List<Integer> arg1) -> {return arg1.stream();});//.forEach((Integer arg3) -> {System.out.println(arg3);});
		obj0.map((Integer arg2) -> {return arg2;}).forEach(System.out::println);
	    //Stream<List<Integer>> obj1 = list4.stream().map((List<Integer> arg0) -> {return arg0;});
		Stream<List<Integer>> check = Stream.of(list2,list3);// same as m1 reference variable

	}

}
