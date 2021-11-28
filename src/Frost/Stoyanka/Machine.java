package Frost.Stoyanka;

public class Machine {
private int dver;
private String marka;
private int vmax;
private boolean rabotaet=false;

    public int getDver() {
        return dver;
    }

    public void setDver(int fig) {
        this.dver = fig;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getVmax() {
        return vmax;
    }

    public void setVmax(int vmax) {
        this.vmax = vmax;
    }

    @Override
    public String toString() {
        return "Machine " +
                "dver=" + dver +
                ", marka='" + marka + '\'' +
                ", vmax=" + vmax +
        ", machine rabotaet= " + rabotaet ;
    }

    public void setRabotaet(boolean rabotaet) {
        this.rabotaet = rabotaet;
    }

    public boolean isRabotaet() {
        return rabotaet;
    }

    public String starter(){
        if (rabotaet==true){
            return "Fire started";
        } else {
            String starter = new String("Machine started");
            setRabotaet(true);
            return starter;
        }

    }

    public String stop() {
        if (rabotaet == false) {
            return "Machine off";
        } else {
            String stop = new String("Machine stoped");
            setRabotaet(false);
            return stop;
        }
    }

    public Machine(int dver, String marka, int vmax, boolean rabotaet) {
        this.dver = dver;
        this.marka = marka;
        this.vmax = vmax;
        this.rabotaet = rabotaet;
    }
}
