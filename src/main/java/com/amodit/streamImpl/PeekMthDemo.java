package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PeekMthDemo {

	public static void main(String[] args) {
		// peek() method to print element at different stages in a pipeline 
		List<String> list1 = Arrays.asList("Apple", "Banana", "Cherry");
		Stream<List<String>> myStream1 = Stream.ofNullable(list1);
		myStream1.peek((List<String> arg0) -> {System.out.println("Original String: "+arg0.get(0));})
		                       .map((List<String> arg1) -> {return arg1.get(0).toUpperCase();})
		                       .peek((String arg2) -> {System.out.println("UpperCased String: "+arg2);})
		                       .filter((String arg3) -> {return arg3.startsWith("A");})
		                       .peek((String arg4) -> {System.out.println("Filtered String: "+arg4);})
		                       .forEach((String arg5) -> {System.out.println("-----");});

	}

}
