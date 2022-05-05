public class HW3_2 {

    public static void main(String[] args) {

        String Task = " ";

        System.out.println("Task 1 ");
        //Необходимо вывести числа от 0 до 15.

        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        //Необходимо вывести все положительные степени числа 5 которые меньше 10000,
        // вывести результат возведения в степень.

        for (int f = 1; f < 10000; f = f * 5) {
            System.out.println(f);
        }

        System.out.println("Task 3 ");

        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //без использования конструкции if (шаг цикла на ваше усмотрение).

       /* for (int z = 40; z <= 60; z = z + 1) { // первый вариант
            if (z % 4 == 0) {
                System.out.println(z);
            }
        }*/

        for (int z = 40; z <= 60; z = z + 4){
            System.out.println(z);
        }
    }
}
