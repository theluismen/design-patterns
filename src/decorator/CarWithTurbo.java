package decorator;

/* Clase decoradora */
public class CarWithTurbo extends Car {
    private Car car;

    public CarWithTurbo( Car car ) {
        super(car.getBrand(), car.getPrice());
        this.car = car;
    }

    // Getter para price
    public int getPrice() {
        return this.car.getPrice() + 1000;
    }

    public void turbo() {
        System.out.println("Stutututu...");
    }
}
