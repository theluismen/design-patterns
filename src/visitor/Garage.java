package visitor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Garage implements CarComponent {
    /* Atributos */
    private List<CarComponent> cars;
    /* Constructor */
    public Garage () {
        this.cars = new ArrayList<>();
    }

    /* Metodos */
    public void addCar ( CarComponent car ) {
        this.cars.add( car );
    }
    /* Metodos: Interface CarComponent */
    public void accept ( CarVisitor visitor ) {
        for ( CarComponent car : this.cars ) {
            car.accept( visitor );
        }
    }
}
