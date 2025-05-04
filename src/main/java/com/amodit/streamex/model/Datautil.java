package com.amodit.streamex.model;

import java.util.Arrays;
import java.util.List;

public class Datautil {
	
	public static List<Student> getStudentList(){
		Student s1 = new Student(1, "AAA", 123,"java" , 5000.00, 1000.00);
		Student s2 = new Student(2, "BBB", 123456, "C++", 7000.00, 2000.00);
		Student s3 = new Student(3, "CCC", 456,"java" , 5000.00, 1000.00);
		Student s4 = new Student(4, "DDD", 678, "C++", 7000.00, 2000.00);
		Student s5 = new Student(5, "EEE", 910,"python" , 4000.00, 1000.00);
		Student s6 = new Student(6, "FFF", 1112, "C++", 8000.00, 3200.00);
		Student s7 = new Student(7, "GGG", 1314,"java" , 9000.00, 4500.00);
		Student s8 = new Student(8, "JJJ", 1516, "C++", 11000.00, 3000.00);
		Student s9 = new Student(9, "KKK", 1718, "python", 13000.00, 4500.00);
		List<Student> list1 = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9);
		return list1;
		
		
		
	}

}
