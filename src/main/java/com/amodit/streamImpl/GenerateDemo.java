package com.amodit.streamImpl;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenerateDemo {

	public static void main(String[] args) {
		
		
		Stream<Integer> generate = Stream.generate(() -> {return new Random().nextInt(100);});
		generate.limit(10).forEach(System.out::println);
		System.out.println("=====================");
		Stream.generate(() -> {return new Random().nextInt(10);}).limit(20).distinct().forEach((Integer arg0) -> {System.out.println(arg0);});
		System.out.println("=========================");
		Stream.generate(() -> {return new Random().nextInt(11, 35);}).limit(13).distinct()
		.map((Integer arg0) -> {
		if(arg0 % 2 == 0) {
			return arg0;
		}else {
			return arg0 +2;
		}}).forEach((Integer arg0) -> {System.out.println(arg0);});

	}

}
