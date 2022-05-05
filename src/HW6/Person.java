package HW6;

public class Person {

    String name;
    int age;
    char gender;

    String getName(){

        if(gender == 'M'){
            return "Mr."+ name;
        } else{
            return "Mrs." + name;
        }

    }
}

//Необходимо создать класс Person с полями: имя, возраст, пол.
// Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
// если пол указан как мужской и префикс “Mrs. ” если женский.

