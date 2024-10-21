package abstractFactory;

public class Honda extends Car {
    /* Constructor */
    public Honda ( String drive ) {
        super( drive );
    }

    /* Métodos */
    public String message () {
        return super.message() + " made by Honda !!";
    }
}
