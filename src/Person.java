public class Person {

    String name;// Polya mu ne inizyaliziruem, ochen' redko
    int age ;

    Person(String name, int age){//konstruktor
        this.name=name; //this.name--eto pole, prosto name eto parametr
        this.age=age;
    }


    Person(String name){//konstruktor
        this.name=name; //this.name--eto pole, prosto name eto parametr

    }
    //dva metoda s raznumi parametrami ---nazyvaetsya overloading


    void printObject(){

        System.out.println(this.name);//  this vsegda pole
        System.out.println(this.age);

    }

}
