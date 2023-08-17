package src.structural.composite.employees;

import com.sun.management.VMOption;

import java.lang.management.ManagementFactory;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        boolean isDebug = ManagementFactory.getRuntimeMXBean().getInputArguments().toString().indexOf("-agentlib:jdwp") > 0;
        System.out.println("In debug : " + isDebug);

        List<String> options = ManagementFactory.getRuntimeMXBean().getInputArguments();

        for (String s : options) {
            System.out.println(s);
        }


/*
        Employee dev1 = new Developer("Sher", "R&D");
        Employee dev2 = new Developer("Khan", "Development");
        Employee designer = new Designer("Jon", "Art");

        Manager manager = new Manager("Linda", "IBP");

        manager.addEmployee(dev1);
        manager.addEmployee(dev2);
        manager.addEmployee(designer);

        manager.displayDetails();*/

    }




}
