package visitor;

public class Toyota implements CarComponent {
    /* Constructor */
    public Toyota () {}

    /* Metodos */
    public void accept ( CarVisitor visitor ) {
        visitor.visit( this );
    }
}
