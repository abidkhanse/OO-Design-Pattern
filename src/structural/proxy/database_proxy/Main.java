package src.structural.proxy.database_proxy;

public class Main {

    public static void main(String[] args) {

        EmployeeDB employeeDB = new EmployeeDBProxy();

        System.out.println("-----------------------------------------------");
        employeeDB.create("NOT_ADMIN", new Employee(1,"bob"));
        System.out.println("-----------------------------------------------");

        employeeDB.create("ADMIN", new Employee(1,"bob"));
        System.out.println("-----------------------------------------------");

        employeeDB.get("NOT_ADMIN", 1);
        System.out.println("-----------------------------------------------");

        employeeDB.get("ADMIN", 1);
        System.out.println("-----------------------------------------------");

        employeeDB.get("USER", 1);
        System.out.println("-----------------------------------------------");

        employeeDB.delete("USER", 1);
        System.out.println("-----------------------------------------------");

        employeeDB.delete("ADMIN", 1);
        System.out.println("-----------------------------------------------");

    }
}
