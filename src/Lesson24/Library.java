package Lesson24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    static List<Chitateli> chitateliList = new ArrayList<>();
    static List<Book> bookList = new ArrayList<>();

    static void takeBook() {
        System.out.println(bookList);



    }

    static void returnBook() {


    }

    static String userChose() {
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.nextLine());
        return str;
    }

}
