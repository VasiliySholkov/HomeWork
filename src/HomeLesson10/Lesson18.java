package HomeLesson10;

// Задание 18. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.

//public class Lesson18 {
//    public static void main(String... agrs) {
//        String str = "Найти в строке не только запятые, но и другие знаки препинания. Подсчитать\n" +
//                "//общее их количество.";
//        String[] arrayText = str.split("[[\\p{Punct}]*|[\\p{Space}]*]+");
//        System.out.println("количество слов: " + arrayText.length);
//        int count = str.length() - str.replaceAll("\\p{Punct}", "").length();
//        System.out.println("колличество знаков прип-ия: " + count);
//    }
//}

public class Lesson18 {
    public static void main(String... agrs) {
        String str = "Найти в строке не только запятые, но и другие знаки препинания. Подсчитать\n" +
                "//общее их количество.";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '-') {
                n++;
            }
        }
        System.out.println("колличество знаков прип-ия: " + n);
    }
}