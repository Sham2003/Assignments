package com.training.day6;

import java.util.*;
import java.util.stream.*;

public class EmployeeStreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", "IT", "Developer", 60000),
                new Employee(102, "Bob", "HR", "Manager", 75000),
                new Employee(103, "Charlie", "Finance", "Analyst", 50000),
                new Employee(104, "David", "IT", "Architect", 90000),
                new Employee(105, "Eve", "Finance", "Manager", 85000),
                new Employee(106, "Frank", "HR", "Recruiter", 40000),
                new Employee(107, "Grace", "IT", "Developer", 65000)
        );

        System.out.println("High earners sorted by name: ");
        employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        

        System.out.println("Employees grouped by department: ");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((s,l) -> System.out.print(s + ":\n" + l + "\n"));


        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingInt(Employee::getSalary)
                ));
        System.out.println("Average salary by department: " + avgSalaryByDept);

        // 4. Highest paid employee in each department
        Map<String, Optional<Employee>> topPaidByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
                ));
        System.out.println("Top paid employee by department: " + topPaidByDept);

        // 5. List of roles sorted by salary descending
        List<String> rolesSortedBySalary = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .map(Employee::getRole)
                .collect(Collectors.toList());
        System.out.println("Roles sorted by salary: " + rolesSortedBySalary);

        // 6. Total salary expense
        int totalSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Total salary expense: " + totalSalary);

        // 7. Partition employees into high vs low earners (threshold 70,000)
        Map<Boolean, List<Employee>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 70000));
        System.out.println("Partitioned employees (salary > 70k): " + partitioned);

        // 8. Find any IT employee
        employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .findAny()
                .ifPresent(e -> System.out.println("Found IT employee: " + e));

        // 9. Parallel stream example: sum salaries
        int parallelSum = employees.parallelStream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Parallel sum of salaries: " + parallelSum);
    }
}
