package src.structural.proxy.database_proxy;

public class EmployeeDBProxy implements EmployeeDB {

    EmployeeDBImp employeeDBImp;

    public EmployeeDBProxy() {
        this.employeeDBImp = new EmployeeDBImp();
    }

    @Override
    public void create(String client, Employee employee) {

        if (client.equals("ADMIN")) {
            employeeDBImp.create(client, employee);
        } else {
            System.out.println("Create User Access Denied: " + client + " is not authorized");
        }

    }

    @Override
    public void delete(String client, int employeeID) {

        if (client.equals("ADMIN")) {
            employeeDBImp.delete(client, employeeID);
        } else {
            System.out.println("Delete User Access Denied: " + client + " is not authorized");
        }
    }

    @Override
    public void get(String client, int employeeID) {

        if (client.equals("ADMIN") || client.equals("USER")) {
            employeeDBImp.get(client, employeeID);
        } else {
            System.out.println("View User Access Denied: " + client + " is not authorized");
        }

    }

}
