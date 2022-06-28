package ITOveroneSecond.Level4.Lesson4Annotaitions;

/*
Создайте 2 аннотации: OnlyForField, OnlyForMethod.
Сделайте так, чтобы 1ую аннотацию можно было добавлять только к полям,
а 2ую аннотацию только к методам. Создайте класс с 2 любыми полями и 2 любыми методами,
добавьте @OnlyForField на оба поля и @OnlyForMethod только на 1 любой метод.
 */
public class Task1 {
    @OnlyForField
    int i;
    @OnlyForField
    String s;

    @OnlyForMethod
    void method1() {}

    void method2(){}
}
