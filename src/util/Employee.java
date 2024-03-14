package util;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Id: " + id +"\n" +"Name: " + name + "\n" + "Salary: " + salary;
	}

}
