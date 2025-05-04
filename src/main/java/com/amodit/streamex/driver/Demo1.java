package com.amodit.streamex.driver;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.amodit.streamex.model.Datautil;
import com.amodit.streamex.model.Student;

public class Demo1 {

	public static void main(String[] args) {

		List<Student> listStudent = Datautil.getStudentList();

		// get all students
		listStudent.stream().forEach((Student arg0) -> {
			System.out.println(arg0);
		});
		System.out.println("=================");
		// student who has to pay the fee balance
		listStudent.stream().filter((Student arg0) -> {
			if (arg0.getFeeBalance() < 3000) {
				return true;
			} else {
				return false;
			}
		}).forEach(System.out::println);
		System.out.println("======================");
		// display students in descending order based on the names
		listStudent.stream().sorted((Student arg0, Student arg1) -> {return arg1.getSname().compareTo(arg0.getSname());})
		                    .forEach(System.out::println);
		System.out.println("======================");
	   Stream<Student> s2  = listStudent.stream();
	   Optional<Student> o2  = s2.min((Student arg0, Student arg1) -> {return arg0.getFeeBalance().compareTo(arg1.getFeeBalance());});
	   //Double d = o2.map((Student stud1) -> {return stud1.getFeeBalance();}).orElseGet(() -> {return 0.00;});
	   //System.out.println(d);
	   //o2.ifPresent((Student arg0) -> {System.out.println(arg0);});
	   System.out.println(o2);
	   System.out.println("******* collect(Collector) method and using Collectors.minBy() method **********");
	   // by using collect(Collector c) method
	   Optional<Student> collectminBy = listStudent.stream()
	           .collect(Collectors.minBy((Student arg0, Student arg1) -> {return arg0.getFeeBalance().compareTo(arg1.getFeeBalance());}));
	   System.out.println(collectminBy.orElse(new Student()));
	   
	}

}
