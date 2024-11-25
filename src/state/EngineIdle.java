package state;

public class EngineIdle implements EngineState {

    public void forward ( Engine engine ) {
        System.out.println("[!] - Engine is already idling.");
    }

    public void backward ( Engine engine ) {
        engine.setState( new EngineOff() );
    }

    public void print() {
        System.out.println("ENGINE: Engine is idling.");
    }

}
