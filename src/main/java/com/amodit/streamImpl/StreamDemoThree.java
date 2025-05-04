package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoThree {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> list2 = Arrays.asList(9,10,11);
		Stream<Integer> s1 = list1.stream();
		Stream<Integer> s2 = list2.stream();
		Stream<Integer> s3 = Stream.concat(s1, s2);
		s3.forEach(System.out:: println);
		
		List<List<Integer>> listOfList = Arrays.asList(list1, list2);
		Stream<List<Integer>> streamOfListIntger = listOfList.stream();
		System.out.println("==================");
		List<Integer> list3 = Arrays.asList(5,6,7,8);
		List<Integer> list4 = Arrays.asList(15,16,18);
		List<List<Integer>> listOfList2 = Arrays.asList(list3, list4);
		Stream<List<Integer>> streamOfListIntger2 = listOfList2.stream();
		Stream.concat(streamOfListIntger, streamOfListIntger2).forEach(System.out:: println);
		
		
		

	}

}
