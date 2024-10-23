package adapter;

public class Main {
    public static void main(String[] args) {
        OldCar     oldCar = new OldCar();
        CarAdapter newCar = new CarAdapter( oldCar );

        System.out.println( newCar.accelerate() );
        System.out.println( newCar.brake() );
    }
}
