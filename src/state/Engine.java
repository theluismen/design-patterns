package state;

public class Engine {
    /* Atributos */
    private EngineState state;

    /* Constructor*/
    public Engine (  ) {
        this.state = new EngineOff();
    }

    public void setState ( EngineState state ) {
         this.state = state;
    }

    public void forwardState () {
        this.state.forward( this );
    }

    public void backwardState () {
        this.state.backward( this );
    }

    public void printState () {
        this.state.print();
    }

}
