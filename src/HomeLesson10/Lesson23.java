package HomeLesson10;

// Задание 23
//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//абзацев <p>.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson23 {

    public static void main(String[] args) {
        String str="0x7FFF <p id=p1> 0x7AAF <p id=p1> kkkk  khg gkhjg";
        System.out.println(str.replaceAll("<p id=p1>", "<p>"));
        Pattern p=Pattern.compile("uhhhh");
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.start()+" "+m.end());
        }
    }
}

