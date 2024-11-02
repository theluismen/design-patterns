package visitor;

public class Honda implements CarComponent {
    /* Constructor */
    public Honda () {}

    /* Metodos */
    public void accept ( CarVisitor visitor ) {
        visitor.visit( this );
    }
}
