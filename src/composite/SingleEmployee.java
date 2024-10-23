package composite;

/* Clase Hoja */
public class SingleEmployee implements Employee {
    /* Atributos */
    private String name;

    /* Constructor */
    public SingleEmployee ( String name ) {
        this.name = name;
    }
    /* Métodos */

    @Override
    public String doJob() {
        return "\t" + this.name + " is doing the Job...\n";
    }
}
