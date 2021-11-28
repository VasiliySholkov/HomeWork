package Lesson24;

public class Chitateli {

    private String fio;
    private int bilet;
    private String fakultet;
    private String datarozhdenia;
    private String telefon;

    public Chitateli(String fio, int bilet, String fakultet, String datarozhdenia, String telefon) {
        this.fio = fio;
        this.bilet = bilet;
        this.fakultet = fakultet;
        this.datarozhdenia = datarozhdenia;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Chitateli{" +
                "fio='" + fio + '\'' +
                ", bilet=" + bilet +
                ", fakultet='" + fakultet + '\'' +
                ", datarozhdenia='" + datarozhdenia + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getBilet() {
        return bilet;
    }

    public void setBilet(int bilet) {
        this.bilet = bilet;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getDatarozhdenia() {
        return datarozhdenia;
    }

    public void setDatarozhdenia(String datarozhdenia) {
        this.datarozhdenia = datarozhdenia;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


}
