package state;

public interface EngineState {
    void forward ( Engine engine );
    void backward ( Engine engine );
    void print ();
}
