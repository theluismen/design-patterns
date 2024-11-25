package state;

public class EngineOff implements EngineState {

    public void forward ( Engine engine ) {
        engine.setState( new EngineWarmUp() );
    }

    public void backward ( Engine engine ) {
        System.out.println("[!] - Engine is already off.");
    }

    public void print () {
        System.out.println("ENGINE: Engine is off.");
    }

}
