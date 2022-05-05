public class Codewars {
    public static char getGrade(int s1, int s2, int s3) {
        char a ='H';
        int middle = (s1+s2+s3)/3;
        if (90 <100){
            return 'A';
        } if (80 <  90){
            return 'B';
        } if(70 <  80){
            return 'C';
        } if (60 < 70){
            return'D';
        } if (0 <60){
            return 'F';
        }

        return a;
    }

    public static String bmi(double weight, double height) {
        String result = "my weight";
        double bmi = weight / (height * 2);
        if (bmi <= 18.5) {
            result ="Underweight";
        }
        if (bmi <= 25.0) {
            result ="Normal";
        }
        if (bmi > 30.0) {
            result="Overweight";
        }
        if (bmi > 30) {
            result="Obese";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));

        System.out.println(getGrade(25,81,55));
        getGrade(35,25,99);

    }
}
