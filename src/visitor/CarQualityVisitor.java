package visitor;

public class CarQualityVisitor implements CarVisitor {
    public void visit( Honda car ) {
        System.out.println("Honda: 10/10");
    }

    public void visit( Nissan car ) {
        System.out.println("Nissan: 9/10");
    }

    public void visit( Toyota car ) {
        System.out.println("Toyota: 9/10");
    }
}
