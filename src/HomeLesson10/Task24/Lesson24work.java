package HomeLesson10.Task24;

// Задание 24
//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.

public class Lesson24work {
    int sec;
    int min;
    int h;

    public Lesson24work(int sec, int min, int h) {
        this.sec = sec;
        this.min = min;
        this.h = h;
    }

    public Lesson24work(int sec) {
        this.sec = allsecond();
    }

    public Lesson24work() {
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Lesson24work{" +
                "sec=" + sec +
                ", min=" + min +
                ", h=" + h +
                '}';
    }
    public  int allsecond (){
        return sec + (min*60) + (h*3600);
    }
}
