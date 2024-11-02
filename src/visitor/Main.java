package visitor;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.addCar( new Honda() );
        garage.addCar( new Nissan() );
        garage.addCar( new Toyota() );

        garage.accept( new CarQualityVisitor() );
    }
}
