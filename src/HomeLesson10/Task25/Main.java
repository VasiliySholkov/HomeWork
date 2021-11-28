package HomeLesson10.Task25;

public class Main {
    public static void main (String [] args) {
        Atm atm = new Atm ();
        System.out.println(atm.toString());
        atm.addDeneg(100,100,100);
        System.out.println(atm.toString());
        atm.getDeneg(270);
        System.out.println(atm);
    }
}
