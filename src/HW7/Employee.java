package HW7;

public class Employee {

    //Необходимо создать класс Employee со следующими методами:
    //getBaseSalary - получить базовую ставку
    //set Base Salary
    //getName - получить имя
    //setName
    //getSalary - получить зарплату

    private String name;
    private int salary;
    private int baseSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Employee(String name, int salary, int baseSalary) {
        this.name = name;
        this.salary = salary;
        this.baseSalary = baseSalary;
    }
}
