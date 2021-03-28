
package hu.unideb.inf;
import java.io.IOException;

public class Food implements Persistent{
    private int quantity;
    private String name;
    private int price;

    public Food(int quantity, String name, int price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }
    /*
    public Food() {
        
    }
    */
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return quantity + " x " + name + ", " + price + "Ft";
    }
    
    public static Food scannedFood(FoodDataReader fdr){
        int price,quantity;
        String name;
        price = fdr.getPrice();
        name=fdr.getName();
        quantity=fdr.getQuantity();
        return new Food(quantity, name, price);
    }
    
    //perzisztencia megvalositasa
    protected final static String ismeretlen = new String("Ismeretlen");
    //az ures konstruktort kikommenteltem, hogy mukodjon
    public Food() {
        quantity = 0;
        name = ismeretlen;
        price = 0;
    }
    
    public void write(PersistentOutput out) throws IOException {
        out.writeUTF(Integer.toString(quantity));
        out.writeUTF(name);
        out.writeUTF(Integer.toString(price));
    }
    public void read(PersistentInput in) throws IOException {
        String stringQuantity;
        String stringPrice;
        stringQuantity = in.readUTF();
        quantity = Integer.parseInt(stringQuantity);
        name = in.readUTF();
        stringPrice = in.readUTF();
        price = Integer.parseInt(stringPrice);
    }
}
