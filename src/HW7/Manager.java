package HW7;

public class Manager extends Employee {
    //Необходимо создать класс Manager в который нужно добавить следующие методы:
    //getNumberOfSubordinates - получить количество подчиненных
    //setNumberOfSubordinates
    //в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
    // Если количество подчиненных 0, то результат как у обычного рабочего.
    //
    //Необходимо создать класс Director с теми же методами,
    // что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
    // Если количество подчиненных 0, то результат как у обычного рабочего.


    private int numberOfSubordinates;

    public Manager(String name, int salary, int baseSalary, int numberOfSubordinates) {
        super(name, salary, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }


    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates= numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 3);
        }
    }



}
