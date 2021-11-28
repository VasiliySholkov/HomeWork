package HomeLesson10;

// Задание 20
//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.

public class Lesson20 {

    public static void main(String[] args) {
        String str = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        int count = 0;
        char symbol;
        str.trim();
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ' ') {
                System.out.print(i +" ");
            }
        }
    }
}
// не получилось вывести символы индексов "i"