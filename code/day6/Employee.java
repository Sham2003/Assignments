package com.training.day6;

public class Employee implements Comparable<Employee> {
    private int empid;
    private String name;
    private String department;
    private String role;
    private int salary;

    public Employee(int empid, String name, String department, String role, int salary) {
        this.empid = empid;
        this.name = name;
        this.department = department;
        this.role = role;
        this.salary = salary;
    }

    public int getEmpid() { return empid; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getRole() { return role; }
    public int getSalary() { return salary; }

    public void setEmpid(int empid) { this.empid = empid; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setRole(String role) { this.role = role; }
    public void setSalary(int salary) { this.salary = salary; }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
