package com.practice;

class Employee {

	String name;

	Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class CallByValueOrReference {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Shiv");
		
		checkCallByReference(emp);
		
		System.out.println(emp);
		System.out.println(emp.getName());

	}

	private static void checkCallByReference(Employee emp) {
		
		emp.setName("Arjun");
		emp = null;
		// it means java is call by value
		
	}

}
