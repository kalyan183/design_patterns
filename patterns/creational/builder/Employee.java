package org.examples.patterns.creational.builder;

import lombok.ToString;

/**
 * Builder pattern aims to “Separate the construction of a complex object from its representation
 * so that the same construction process can create different representations.”
 * It is used to construct a complex object step by step and
 * the final step will return the object.
 */
@ToString
public class Employee {

    private String employeeName;
    private Double salary;
    private Long employeeId;
    private String department;
    private String email;
    private Address address;

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {

        private String employeeName;
        private Double salary;
        private Long employeeId;
        private String department;
        private String email;
        private Address address;

        public EmployeeBuilder withSalary(final Double salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder withName(final String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public EmployeeBuilder withEmployeeId(final Long employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeBuilder withDepartment(final String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder withEmail(final String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder withAddress(final Address address) {
            this.address = address;
            return this;
        }

        public Employee build() {

            Employee em = new Employee();
            em.address = address;
            em.employeeId = employeeId;
            em.employeeName = employeeName;
            em.salary = salary;
            em.department = department;
            em.email = email;
            return em;
        }



    }

}
