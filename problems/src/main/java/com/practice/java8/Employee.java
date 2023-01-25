package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(
				new Employee(1, "Samir", 70),
				new Employee(2, "Kumar", 43),
				new Employee(3, "Arun", 56),
				new Employee(4, "Samir", 55),
				new Employee(5, "Tania", 36),
				new Employee(6, "Samir", 36));

		 
		
		System.out.println("ascending order sorting by age.");
		List<Employee> ascSortedList = empList.stream().sorted((x, y) -> x.getAge() - y.getAge()).collect(Collectors.toList());
		System.out.println(ascSortedList);
		
		
		
		System.out.println("descending order sorting by age.");
		List<Employee> descSortedList = empList.stream().sorted((x, y) -> y.getAge() - x.getAge()).collect(Collectors.toList());
		System.out.println(descSortedList);
		
		System.out.println("grouping by names");
		
		Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(x -> x.getName()));
		System.out.println(map);
		
		empList.stream().collect(Collectors.groupingBy(x -> x.getName())).forEach((x,y) -> System.out.println(x + "  -  "  + y.size()));
		
		empList.stream().filter(x -> x.getName().startsWith("A")).forEach(System.out :: println);
		
		Map<String, Employee> map2 = empList.stream().collect(Collectors.toMap(x -> x.getName(), x -> x, (oldVal, newVal) -> newVal));
		System.out.println(map2);
		
		
		

	}

}
