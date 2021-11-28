package HomeLesson10;

// Задание 24
//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.

public class Lesson24 {

    public static class MainTimeInterval {
        public static void main(String[] args) {
            Lesson24 obj1 = new Lesson24(12578);
            Lesson24 obj2 = new Lesson24(15,20,36);
            obj1.printAllTime();
            obj2.printDividedTime();
            obj2.compareTime();
        }
    }

    private int hour;
    private int minut;
    private int second;

    public Lesson24(int h, int m, int s) {
        hour = h;
        minut = m;
        second = s;
    }
    public Lesson24(int allsec) {
        second = allsec;
    }
    public int returnAllSecond() {
        return hour * 3600 + minut * 60 + second;
        }
        public void printAllTime() {
            System.out.println("Object1 \\(only seconds\\) = " + second);
        }
        public void printDividedTime() {
            System.out.println(String.format("Object2 have %s hours, %s minuts, %s seconds", hour, minut, second));
        }
        public int compareTime() {
            if (this.second >= this.returnAllSecond()) {
                System.out.println("Object1 => Object2");
            } else {
                System.out.println("Object1 < Object2");
            }
            return this.second - this.returnAllSecond();
        }
}
