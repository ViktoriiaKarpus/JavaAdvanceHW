package HW6;

public class Main { // Employee
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.person.name = "Viktoriia";

        Employee employee2 = new Employee();
        employee2.person.name = "Viktoriia";

        System.out.println(employee1.isSameName(employee2));


    }


}
