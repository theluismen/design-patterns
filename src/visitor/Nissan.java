package visitor;

public class Nissan implements CarComponent {
    /* Constructor */
    public Nissan () {}

    /* Metodos */
    public void accept ( CarVisitor visitor ) {
        visitor.visit( this );
    }
}