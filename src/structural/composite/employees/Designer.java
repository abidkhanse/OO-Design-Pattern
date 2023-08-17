package src.structural.composite.employees;

public class Designer implements Employee {

    private String name;
    private String department;
    public Designer(String name, String department) {

        this.name = name;
        this.department = department;

    }

    @Override
    public void displayDetails() {

        System.out.println("| ------------------------------------");
        System.out.println("| Employee Name: " + this.name );
        System.out.println("| Department Name: " + this.department );
        System.out.println("| ------------------------------------");

    }
}
