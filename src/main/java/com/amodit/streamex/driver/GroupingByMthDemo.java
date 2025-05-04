package com.amodit.streamex.driver;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.amodit.streamex.model.Datautil;
import com.amodit.streamex.model.Student;

public class GroupingByMthDemo {

	public static void main(String[] args) {
		
		List<Student> studentList = Datautil.getStudentList();
		Map<String, List<Student>> obj1 = studentList.stream()
		           .collect(Collectors.groupingBy((Student arg0) -> {return arg0.getCoursename();}));
		
		
		System.out.println("GroupingByMthDemo class");
		

	}

}
