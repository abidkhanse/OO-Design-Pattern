package src.structural.proxy.database_proxy;

public class EmployeeDBImp implements EmployeeDB {

    @Override
    public void create(String name, Employee employee) {
        System.out.println("Creating user " + employee.toString());
    }

    @Override
    public void delete(String name, int employeeID) {
        System.out.println("Delete employee ID " + employeeID);
    }

    @Override
    public void get(String name, int employeeID) {
        System.out.println("Getting record from database for ID " + employeeID);
    }
}
