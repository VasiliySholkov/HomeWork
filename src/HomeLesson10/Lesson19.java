package HomeLesson10;

// Задание 19
//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.

public class Lesson19{
    public static void main(String[] args) {
        String str1="Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно \n" +
                "//учесть, что слова могут разделяться несколькими пробелами, в начале и конце\n" +
                "//текста также могут быть пробелы, но могут и отсутствовать. ";
        int count = 0;
        char symbol;
        System.out.println(str1.trim());
        for (int i = 0; i < str1.length(); i++) {
            symbol = str1.charAt(i);
            if (symbol == ' ') {
                count++;
            }
        }
        System.out.println(count+ 1 +" слов в тексте");
    }
}