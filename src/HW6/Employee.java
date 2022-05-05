package HW6;

public class Employee {


    Person person = new Person();
    int salary;

    boolean isSameName(Employee employee){
        if(person.name.equals(employee.person.name)){
            return true;
        } else{
            return false;
        }
    }

}


//Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
// и поле зарплата. Класс должен иметь метод isSameName(Employee employee)
// который возвращает true, если у сотрудника у которого был вызван метод
// и сотрудника который был передан как параметр, одинаковое имя.