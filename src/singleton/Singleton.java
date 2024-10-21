package singleton;

public class Singleton {
    /* Atributos */
    private static Singleton instance = null;

    /* Constructor: podria no ser vacio */
    private Singleton () { }

    /* Métodos */
    public static Singleton getInstance () {
        if ( Singleton.instance == null )
            Singleton.instance = new Singleton();

        return Singleton.instance;
    }

    public String welcomeMsg() {
        return "Hello, you are using Singleton !";
    };
}
