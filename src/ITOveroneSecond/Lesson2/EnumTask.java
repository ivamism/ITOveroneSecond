package ITOveroneSecond.Lesson2;

/*
создайте enum Возраст, добавьте константы: молодой, взрослый, пожилой, долгожитель.
В методе main создайте переменную “мой возраст” и присвойте одну из констант из enum Возраст,
 далее выведите переменную на экран.
 */
enum Age {Young, Adult, Elderly, LongLived}

public class EnumTask {
    public static void main(String[] args) {
        Age myAge = Age.Adult;
        System.out.println(myAge);
    }
}
