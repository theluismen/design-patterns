package observer;

import java.util.ArrayList;
import java.util.List;

public class Civic {
    /* Atributos */
    private int revs;
    private int redline;
    private final List<Observer> observers;

    /* Constructor */
    public Civic ( int vtec, int redline ) {
        this.revs = 1000;
        this.redline = redline;
        this.observers = new ArrayList<>();
        this.observers.add( new ObserverVTEC( vtec ) );
    }

    // Getter
    public int getRevs () {
        return this.revs;
    }

    public void accelerate () {
        this.revs += 500;
        this.notifyObservers( this.revs );
    }

    public boolean redlines () {
        return this.revs > this.redline;
    }

    public void notifyObservers ( int revs ) {
        for ( Observer observer : this.observers ) {
            observer.notifyObserver( revs );
        }
    }
}
