package decorator;

public class Main {
    public static void main(String[] args) {
        Car civic = new Car("Honda", 1500);
        CarWithTurbo civicWithTurbo = new CarWithTurbo( civic );
        CarWithExhaust civicWithExhaust = new CarWithExhaust( civicWithTurbo );


        System.out.println("- Civic");
        System.out.println("    Price:" + civic.getPrice() );
        System.out.println("- Civic With Turbo");
        System.out.println("    Price:" + civicWithTurbo.getPrice() );
        System.out.println("- Civic With Turbo and Exhaust");
        System.out.println("    Price:" + civicWithExhaust.getPrice() );
    }
}