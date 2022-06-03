package ITOveroneSecond;
/*
Создать новый проект.
Написать метод, который принимает список чисел и возвращает минимальное число из списка чисел.
В main продемонстрировать работу этого метода. Закоммитить, затем запушить эту з-чу в репозиторий.
Скинуть ссылку на этот репозиторий в чат, либо в личку.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GitLessonHomeWork {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        Random numGen = new Random();
        for (int i = 0; i < 30; i++) {
            numbersList.add(numGen.nextInt(130)-30);
        }
        System.out.println("numburList: \n" + numbersList);
        System.out.println("Min of numberList = " + findMin(numbersList));
    }
    static int findMin(List<Integer> someList) {
        return Collections.min(someList);
    }
}


