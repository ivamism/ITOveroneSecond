package ITOveroneSecond.Level4.Lesson3Exceptions;
/*
Создайте класс Человек с полем age, сделайте поле закрытым, создайте геттер и сеттер к полю,
в сеттер добавьте проверку, если переданный аргумент меньше нуля выкиньте исключение RuntimeException
с сообщением “Возраст должен быть больше нуля”. Создайте метод main,
в нём объект класса Человек и вызовите сеттер дважды, 1й раз с корректным значением, 2й раз с некорректным.
 */

public class Human {
     private static int age;

//    public static String getName() {
//        return name;
//    }
//
//    public static void setName(String name) {
//        Human.name = name;
//    }

    static String name;

    public static void setAge(int age) {
        if (age <0){
            throw new RuntimeException("Не корректное число для возраст. Введите корректное число");
        }
        Human.age = age;
    }

    public static int getAge() {
        return age;
    }

    public static void main(String[] args) {
        setAge(50);
        System.out.println("Возраст " + getAge());
//        System.out.println(name);
        setAge(-5);
        System.out.println(getAge());

    }
}
