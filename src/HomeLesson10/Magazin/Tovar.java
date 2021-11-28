package HomeLesson10.Magazin;

public class Tovar {

    private long id;
    private String name;
    private int price;

    static long count;

    public Tovar(long id, String name, int price) {
        this.id = count++;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }



}
