package observer;

public class Main {
    public static void main(String[] args) {

        Civic civic = new Civic ( 4000, 8000);

        while ( ! civic.redlines() ) {
            System.out.println("Revs: " + civic.getRevs());
            System.out.println("Accelerating...");
            civic.accelerate();
        }
    }
}
