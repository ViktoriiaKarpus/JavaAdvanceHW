package Practice;

public class Codewars_tasks {

    public static int makeNegative(final int x) {

        if(x < 0){
            return x;
        }else if(x > 0){
            return x * (-1);
        }else if(x == 0){
            return 0;
        }
        return x;
    }

    public static int simpleMultiplication(int n) {
        int number = 8;
        if(number %2 ==0 ){
            return  number * 8;
        } else{
            return number * 9;
        }
    }

    public static void main(String[] args) {

        makeNegative(2);
        System.out.println( makeNegative(2));

        simpleMultiplication(8);
        System.out.println( simpleMultiplication(8));
    }
}


