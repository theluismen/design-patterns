package observer;

public class ObserverVTEC implements Observer {
    /* Atributos */
    private int vtec; // RPM where vtec kicks in

    public ObserverVTEC ( int vtec ) {
        this.vtec = vtec;
    }

    public void notifyObserver( int rpm ) {
        if ( this.vtec <= rpm ) {
            System.out.println("VTEC just kicked in yo");
        }
    }
}
