package com.amodit.streamImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> stream1 = list1.stream();
		Long res = stream1.collect(Collectors.counting());
		System.out.println(res);
		System.out.println("========");
		List<Integer> result2 = list1.stream().collect(Collectors.filtering((Integer arg0) -> {
			if(arg0 % 2 == 0) {
				return true;
			}else {
				return false;
			}
		} , Collectors.toList()));
		System.out.println(result2);
		System.out.println(result2.getClass());
		System.out.println("========");
		Set<Integer>set = list1.stream().collect(Collectors.toSet());
		System.out.println(set);
		System.out.println(set.getClass());
	}

}
