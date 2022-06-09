package ITOveroneSecond.Level4.Lessson3;

public class Task2 {
    public static void main(String[] args) {
        Human ivan = new Human();

        ivan.setAge(50);
        System.out.println("Возраст: " + ivan.getAge());

        ivan.setAge(-20);
        System.out.println("Возраст: " + ivan.getAge());
    }
}
