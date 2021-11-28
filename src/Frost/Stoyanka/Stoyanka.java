package Frost.Stoyanka;

import java.util.Scanner;

public class Stoyanka {
    private int mestaDlyaParkovki;
    private boolean shlakbum;

    public void startMenu(){
        System.out.println("Vibirite deystvie: \n " +
                "1. Pozvonitr storozhu. \n " +
                "2. Otkrit' shlakbaum \n" +
                "3. exit");
userChose();
    }
    public Integer  userChose(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        try {
            return Integer.parseInt(string);
        }catch (NumberFormatException exception){
            System.out.println("error code");
            return  userChose();
        }
    }
}
