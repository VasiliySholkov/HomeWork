package Andersen.DLL;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(8, 65);

        list.display();

    }
}
