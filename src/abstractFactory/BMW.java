package abstractFactory;

public class BMW extends Car {
    /* Constructor */
    public BMW ( String drive ) {
        super( drive );
    }

    /* Métodos */
    public String message () {
        return super.message() + " made by BMW !!";
    }
}
