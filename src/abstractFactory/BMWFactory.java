package abstractFactory;

public class BMWFactory implements CarFactory {
    public Car createCar() {
        return new BMW( "RWD" );
    }
}
