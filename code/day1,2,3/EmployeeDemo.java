package com.training.first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
	 private static int count = 0;
    int empId;
     String name;
    double salary;

    public Employee(String name, double salary) {
        this.empId = count++;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name  + ", salary=" + salary
				+ "]";
	}

}
 
 
 public class EmployeeDemo {
	 public static void main(String[] args) {
		 List<Employee> employees = Arrays.asList(
		            new Employee("Koushik", 40000),
		            new Employee("Sham", 60000),
		            new Employee("Naresh", 50000)
		        );

	        employees.sort(Comparator.comparingDouble(Employee::getSalary));

	        
	        for (Employee e : employees) {
	            System.out.println(e.name + " - " + e.salary);
	        }
	 }
 }
 
  
