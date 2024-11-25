package state;

public class EngineWarmUp implements EngineState {

    public void forward ( Engine engine ) {
        engine.setState( new EngineIdle() );
    }

    public void backward ( Engine engine ) {
        engine.setState( new EngineOff() );
    }

    public void print() {
        System.out.println("ENGINE: Engine is warming up.");
    }

}
