import java.util.Arrays;

public class HW4_1 {

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i < num; i++) {
            result = i + 1 + " sheep...";
        }
        return result;
    }

    public static void main(String[] args) {

        String task = " ";
        String line = "******************************************************* ";
        System.out.println(line);
        System.out.println("Task 1");

        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        System.out.println(line);
        System.out.println("Task 2");
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            max = Math.max(max, array1[i]);
        }
        System.out.println("Max Value is: " + max);

        //int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6}; ----Reshenie Sergeya
        //        int max = array1 [0];
        //for(int i = 0; i< array1.length; i++ ) {
        // if (max < array1[i]){
        //max = array1[i];
        // }
        //}
        //sout(max);

        System.out.println(line);
        System.out.println("Task 3");

        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива.
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array2[0];
        for (int i = 0; i < array2.length; i++) {
            min = Math.min(min, array2[i]);
        }
        System.out.println("Max Value is: " + min);

        System.out.println(line);
        System.out.println("Task 4");
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum2 = 0;
        int middl = array3[0];
        for (int i = 0; i < array3.length; i++) {
            sum2 += array3[i];
            middl = sum2 / 2;
        }
        System.out.println(middl);

        System.out.println(line);
        System.out.println("Task 5");

        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.

        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum4 = 0;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                sum4 += array4[i][j];
            }
        }
        System.out.println(sum4);


        System.out.println("Task 7");
        //nt[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести количество элементов в массиве.
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("task 8");


        int array10[] = {34, 15, 88, 2};
        int min2 = array10[0];
        for (int i = 0; i < array10.length; i++) {
            min = Math.min(min, array10[i]);
        }
        System.out.println(min);

        System.out.println("Task 9");


        System.out.println(countingSheep(4));

        int[] numbers10 = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum8 = 0;
        int middle = numbers10[0];
        for (int i = 0; i < numbers10.length; i++) {
            sum8 += numbers10[i];
            middle = sum8 / numbers10.length;
        }
        System.out.println(middle);

        System.out.println();

        int[] array11 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for(int i = 0; i<array11.length;i++){
            System.out.println(Arrays.toString(array11));
        }


    }
}
