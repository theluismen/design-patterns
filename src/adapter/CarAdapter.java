package adapter;

public class CarAdapter implements Car {
    /* Atributos */
    private OldCar oldCar;

    /* Constructor */
    public CarAdapter ( OldCar olCcar ) {
        this.oldCar = olCcar;
    }

    /* Métodos */
    public String accelerate() {
        return this.oldCar.pushGasPedal();
    }

    public String brake() {
        return this.oldCar.pullBrake();
    }
}
