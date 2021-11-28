package HomeLesson10.Magazin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazin {
    static List<Tovar> productList = new ArrayList<>();

    static void startMenu() {
        System.out.println("Enter your chose: \n" +
                "1. AddTovar \n " +
                "2. ShowAllTovar \n " +
                "3. DeleteTovarFromID \n" +
                "4. EditTovar \n" +
                "5. ExitProgram");

        choseMenu(Integer.parseInt(userChose()));
    }

    static String userChose() {
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.nextLine());
        return str;
    }

    static void choseMenu(int chose) {
        switch (chose) {
            case 1:
                System.out.println("Add your Tovar:\n" +
                        "Entered Tovar name, Tovar price.");
                productList.add(new Tovar (Integer.parseInt(userChose()), userChose(), Integer.parseInt(userChose())));
                break;
            case 2:
                System.out.println("Show all Tovar");
                break;
            case 3:
                System.out.println("Delete Tovar from ID");
                break;
            case 4:
                System.out.println("Edit Tovar");
                break;
            case 5:
                System.out.println("Exit Program");
                break;
            default:
                startMenu();
        }
    }
}