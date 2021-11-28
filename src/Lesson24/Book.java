package Lesson24;

public class Book {

    private String nameBook;
    private int kolvoBook;
    private String authorBook;

    public Book(String nameBook, int kolvoBook, String authorBook) {
        this.nameBook = nameBook;
        this.kolvoBook = kolvoBook;
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", kolvoBook=" + kolvoBook +
                ", authorBook='" + authorBook + '\'' +
                '}';
    }



    //private String fakultet;
    //private String datarozhdenia;
    //private String telefon;



}
