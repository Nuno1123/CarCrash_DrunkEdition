package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.objects.Car;
import org.academiadecodigo.carcrash.objects.CopCar;

/**
 * Created by codecadet on 05/02/16.
 */
public class PoliceRadar {

    private Car[] cars;

    public PoliceRadar(Car[] cars) {
        this.cars = cars;
    }


    public void checkRadar(Car car) {

        for (Car c : cars) {

            if (c instanceof CopCar) {
                if (car == c) {
                    continue;
                }
                if ((c.isSober()) && car.comparePositionRadar(c) && car.isDrunk() && (!(car instanceof CopCar)) ) {
                    car.setBusted(true);
                }
                else if ((c.isDrunk()) && car.comparePositionRadar(c) && car.isSober() && (!(car instanceof  CopCar))) {
                    car.setBusted(true);
                }
            }

        }
    }

}
