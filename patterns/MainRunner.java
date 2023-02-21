package org.examples.patterns;

import org.examples.patterns.creational.builder.Address;
import org.examples.patterns.creational.builder.Employee;

public class MainRunner {

    public static void main(String[] args) {

        Employee employee = Employee.builder()
                .withAddress(new Address(
                        "abc",
                        "mg road",
                        "blr highway"
                ))
                .withDepartment("cse")
                .withEmail("heykaalyaan@gmail.com")
                .withEmployeeId(999L)
                .withName("kalyan")
                .withSalary(99d)
                .build();

        System.out.println(employee);

    }
}
