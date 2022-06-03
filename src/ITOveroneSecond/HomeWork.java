package ITOveroneSecond;

/*
Создать новый проект.
Написать метод, который принимает список чисел и возвращает минимальное число из списка чисел.
В main продемонстрировать работу этого метода. Закоммитить, затем запушить эту з-чу в репозиторий.
Скинуть ссылку на этот репозиторий в чат, либо в личку.
 */

import java.util.ArrayList;
import java.util.List;

public class HomeWork {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbersList.add(i, i);
        }

        System.out.println(numbersList);
    }

}


