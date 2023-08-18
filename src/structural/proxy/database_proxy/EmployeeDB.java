package src.structural.proxy.database_proxy;

public interface EmployeeDB {
    void create(String name, Employee employee);
    void delete(String name, int employeeID);
    void get(String name, int employeeID);

}
