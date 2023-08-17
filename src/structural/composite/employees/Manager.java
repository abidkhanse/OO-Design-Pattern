package src.structural.composite.employees;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private List<Employee> employees = new ArrayList<>();
    private String name;
    private String department;

    public Manager(String name, String department) {

        this.name = name;
        this.department = department;
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayDetails() {
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}
