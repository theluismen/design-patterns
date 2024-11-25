package state;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine();

        engine.printState();            // Engine state = EngineOff

        engine.forwardState();
        engine.printState();            // Engine state = EngineWarmUp

        engine.forwardState();
        engine.printState();            // Engine state = EngineIdle

        engine.backwardState();
        engine.printState();            // Engine state = EngineOff
    }
}
