package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + ++i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.lineSeparator();
			System.out.print("Name: ");
			String name = sc.next();
			System.lineSeparator();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);
			employees.add(employee);

		}
		sc.close();

		System.out.println("List of employees:");

		for (Employee person : employees) {
			System.out.println(person);
			System.lineSeparator();
		}

	}

}
