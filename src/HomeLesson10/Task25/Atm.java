package HomeLesson10.Task25;

public class Atm {
    int nom20;
    int nom50;
    int nom100;

    public Atm(int nom20, int nom50, int nom100) {
        this.nom20 = nom20;
        this.nom50 = nom50;
        this.nom100 = nom100;
    }
    public Atm (){

    }

    public void addDeneg(int nom20, int nom50, int nom100){
        this.nom20+=nom20;
        this.nom50+=nom50;
        this.nom100+=nom100;
    }

    public boolean getDeneg (int kolvo) {
        int sum = nom20 * 20 + nom50 * 50 + nom100 * 100;
        int kolvo100=0;
        int kolvo20=0;
        int kolvo50=0;
        if (kolvo > sum) {
            System.out.println("Денег не хватает");
            return false;
        }
        while (kolvo>=100){
            if(kolvo>=100) {
                kolvo100++;
                nom100--;
                kolvo = kolvo - 100;
            }else if(kolvo>=50) {
                kolvo50++;
                nom50--;
                kolvo = kolvo - 50;
            }else if (kolvo>=20){
                kolvo20++;
                nom20--;
                kolvo=kolvo-20;
            }
        }
        System.out.println("Ты получил свою сумму: 20 --- "+kolvo20+", 50 --- "+kolvo50+", 100 --- "+kolvo100);
        return true;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "nom20=" + nom20 +
                ", nom50=" + nom50 +
                ", nom100=" + nom100 +
                '}';
    }
}
