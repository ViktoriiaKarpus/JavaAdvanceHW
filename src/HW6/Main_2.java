package HW6;

public class Main_2 {


    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.person.name = "Viktoriia";
        employee1.salary = 4000;


        Employee employee2 = new Employee();
        employee2.person.name = "Oleg";
        employee2.salary = 4500;

        Salary salary = new Salary();
        Employee[] employeeArray = {employee1,employee2};
        System.out.println(salary.getSum(employeeArray));

    }
}
