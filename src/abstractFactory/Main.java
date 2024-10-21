package abstractFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CarFactory factory;

        if ( ( new Random()).nextInt(2) == 0 ) {
            factory = new HondaFactory();
        } else {
            factory = new BMWFactory();
        }

        Car car = factory.createCar();
        System.out.println( car.message() );
    }
}
