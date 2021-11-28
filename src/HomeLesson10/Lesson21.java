package HomeLesson10;

// Задание 21
//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

public class Lesson21 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        String str= "Java";
        stringBuilder.append("Java");
        stringBuffer.append("Java");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1; i++)
        {
            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
        }
    }
}

