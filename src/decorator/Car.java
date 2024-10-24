package decorator;

public class Car {
    /* Atributos */
    private String brand;
    private int price;

    /* Constructor */
    public Car ( String brand, int price ) {
        this.brand = brand;
        this.price = price;
    }

    // Getter para brand
    public String getBrand() {
        return this.brand;
    }

    // Setter para brand
    public void setBrand( String brand ) {
        this.brand = brand;
    }

    // Getter para price
    public int getPrice() {
        return this.price;
    }

    // Setter para price
    public void setPrice(int price) {
        this.price = price;
    }
}
