package com.mphasis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Employee emp1= new Employee(101, "c", "c", 20000);
		Employee emp2= new Employee(102, "b", "b", 30000);
		Employee emp3= new Employee(103, "d", "d", 20000);
		Employee emp4= new Employee(104, "a", "a", 10000);
		Employee emp5= new Employee(105, "f", "f", 10000);
		Employee emp6= new Employee(106, "e", "e", 50000);

		List<Employee> list= new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		
		List<Employee> list2 = list.stream()
				.sorted(Comparator.comparing(Employee :: getName)
				.thenComparing((Employee::getCity))
				.thenComparingDouble(Employee::getSal))
				.collect(Collectors.toList());
		list2.forEach((emp)->{System.out.println(emp);});
		
		Employee employee = list.stream().max(Comparator.comparing(Employee:: getSal)).get();
		System.out.println("max salary employee "+ employee);
		
		Employee employee2 = list.stream().min(Comparator.comparing(Employee:: getSal)).get();
		System.out.println("min salary employee "+ employee2);
	}
	

}
