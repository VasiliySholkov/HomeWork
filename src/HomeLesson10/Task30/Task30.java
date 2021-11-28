package HomeLesson10.Task30;

// Задание 30
//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task30 {
    public static void main (String ... args) {
        List<Integer> listMarks = new ArrayList<>(); // создаём коллекцию для оценок
        Random random = new Random();
        for (int i=0; i<10; i++) {                // цикл для добавления элементов
            listMarks.add(random.nextInt());     // добавляем элементы
        }
        System.out.println(listMarks);             // выводим на экран всю коллекцию
        for (Iterator<Integer> it = listMarks.iterator(); it.hasNext();) { // создаём объект итератор для перебора нашей коллекции
            if (it.next()<4) // проверка на положительная оценка или нет
                it.remove(); // если оценка отрицательная, то удаляем
        }
        System.out.println(listMarks);

    }
}
