package com.amodit.streamImpl;

import java.util.stream.Stream;

public class IterateDemo {

	public static void main(String[] args) {
		
		Stream<Integer> s1 = Stream.of(11,23,11,13,4,41,8,6,7,9);
		Stream.iterate(1, (Integer arg0) -> {return arg0+1;}).limit(10).forEach((Integer arg1) -> {System.out.println(arg1);});
		

	}

}
