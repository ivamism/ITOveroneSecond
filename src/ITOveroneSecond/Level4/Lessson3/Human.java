package ITOveroneSecond.Level4.Lessson3;
/*
Создайте класс Человек с полем age, сделайте поле закрытым, создайте геттер и сеттер к полю,
в сеттер добавьте проверку, если переданный аргумент меньше нуля выкиньте исключение RuntimeException
с сообщением “Возраст должен быть больше нуля”. Создайте метод main,
в нём объект класса Человек и вызовите сеттер дважды, 1й раз с корректным значением, 2й раз с некорректным.
 */

public class Human {
     private  int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <0){
            throw new RuntimeException("Не корректное число для возраст. Введите корректное число");
        }
        this.age = age;
    }
}
