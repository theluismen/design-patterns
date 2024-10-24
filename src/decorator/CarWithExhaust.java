package decorator;

/* Clase decoradora */
public class CarWithExhaust extends Car {
    /* Atributos */
    private Car car;

    public CarWithExhaust( Car car ) {
        super(car.getBrand(), car.getPrice());
        this.car = car;
    }

    // Getter para price
    public int getPrice() {
        return this.car.getPrice() + 500;
    }

    public void exhaust() {
        System.out.println("BrumBrumBrum...");
    }
}