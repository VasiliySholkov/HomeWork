package HomeLesson10.Task29;


import java.util.*;

public class Task29 {
    public static void main (String ... args){
        List<Integer>listMarks=new ArrayList<>(); // создаём коллекцию для оценок
        Scanner scanner = new Scanner(System.in); // объект для ввода данных с клавиатуры
        for (int i=0; i<10; i++) {                // цикл для добавления элементов
            listMarks.add(scanner.nextInt());     // добавляем элементы
        }
        System.out.println(listMarks);             // выводим на экран всю коллекцию
        for (Iterator<Integer> it = listMarks.iterator(); it.hasNext();) { // создаём объект итератор для перебора нашей коллекции
            if (it.next()<4) // проверка на положительная оценка или нет
                it.remove(); // если оценка отрицательная, то удаляем
        }
        System.out.println(listMarks);
    }
}
