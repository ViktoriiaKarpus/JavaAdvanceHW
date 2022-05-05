package Practice;

public class Arrays_practice {
    public static void main(String[] args) {
        //Дан массив чисел. В методе main нужно посчитать:
        //
        //х — сумму всех нечетных элементов массива
        //у — сумму всех четных элементов массива
        //и вывести в виде: (х;у)

        int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 0;
        int y = 0;
        for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i] % 2 != 0) {
                x += coordinates[i];
            }
            if (coordinates[i] % 2 == 0) {
                y += coordinates[i];
            }
        }
        System.out.println(x);
        System.out.println(y);


        System.out.println("Task 2");
        int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
            count++;
        }
        for (int j = 0; j < secondArray.length; j++) {
            resultArray[count++] = secondArray[j];
        }
        for (int i = 0; i < resultArray.length; i++) {
            if (i == resultArray.length - 1) {
                System.out.println(resultArray[i]);
            } else {
                System.out.print(resultArray[i] + ", ");
            }

        }


        int[] array = new int[]{19, 10, 16, 17, 9, 3, 4, 46, 97, 89, 12, 45, 98, 111, 42, 98, 98, -9, 71, -150};
        /*for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }*/
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Min Value is: " + min);


    }
}

