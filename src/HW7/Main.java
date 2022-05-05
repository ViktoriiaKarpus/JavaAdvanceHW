package HW7;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Вася", 1000, 100);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBaseSalary());

        Manager manager = new Manager("Viktroriia", 4000, 5000, 100);
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
        System.out.println(manager.getBaseSalary());
        System.out.println(manager.getNumberOfSubordinates());


    }

}
