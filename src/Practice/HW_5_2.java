package Practice;

public class HW_5_2 {

    public static void tasks(int number) {

        System.out.println("Task" + number);
    }

    public static void main(String[] args) {

        tasks(1);

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

















        //Распечатать символ a, так что в первой строке всего один символ,
        // во второй - два, в третьей - три, и так далее до 5.

        for (int i = 1; i <= 5; i++) { // переменная i отсчитывает строки
            for (int j = 0; j < i; j++) { // печатаем букву i раз
                System.out.print('a'); // печатаем 'a' без пробелов
            }
            System.out.println(); //поставить enter для новой строчки
        }



    }
}
