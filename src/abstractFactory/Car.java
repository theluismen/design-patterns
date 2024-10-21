package abstractFactory;

/* Car es abstracta pk un coche siempre sera de una marca. */
public abstract class Car {
    /* Atributos */
    private String drive;

    /* Constructor */
    public Car ( String drive ) {
        this.drive = drive;
    }

    /* Métodos */
    // Getters
    public String getDrive() {
        return this.drive;
    }

    // Setters
    public void setDrive() {
        this.drive = drive;
    }

    public String message () {
        return "This is a " + this.getDrive() + " Car !!";
    }
}
