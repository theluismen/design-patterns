package abstractFactory;

public class HondaFactory implements CarFactory {
    public Car createCar() {
        return new Honda( "FWD" );
    }
}
