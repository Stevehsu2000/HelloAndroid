package steve2000.idv.helloandroid;

/**
 * Created by 201 on 2015/6/24.
 */
public class PEN {
    private String Name;
    private int Price;

    public PEN(String name, int price) {
        Name = name;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
