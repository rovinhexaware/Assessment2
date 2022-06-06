package javaMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.print("Employee Name: ");
        System.out.println(employeeList.stream().map(employee -> employee.name).collect(Collectors.toList()));

        Map<String, Integer> departmentCount = new HashMap<>();
        employeeList.stream().forEach(employee -> {
            if(departmentCount.containsKey(employee.department)) departmentCount.put(employee.department, departmentCount.get(employee.department) + 1);
            else departmentCount.put(employee.department, 1);
        });
        System.out.print("Department Count: ");
        System.out.println(departmentCount);
    }

}
