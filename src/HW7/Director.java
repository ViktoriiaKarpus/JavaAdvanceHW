package HW7;

public class Director extends Manager{
    public Director(String name, int salary, int baseSalary, int numberOfSubordinates) {
        super(name, salary, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }
    }

}

    //Необходимо создать класс Director с теми же методами,
// что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
// Если количество подчиненных 0, то результат как у обычного рабочего.
