package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.objects.Car;
import org.academiadecodigo.carcrash.objects.CopCar;

/**
 * Created by codecadet on 05/02/16.
 */
public class CollisionDetector {

    private Car[] cars;

    public CollisionDetector(Car[] cars) {
        this.cars = cars;
    }

    public void checkCollision(Car car) {

        for (Car c : cars) {

            if (c instanceof CopCar) {

                if (car == c) {
                    continue;
                }
                if (car.comparePosition(c)) {
                    car.setCrashed(true);
                }
                c.setCrashed(false);
            }
            else {
                if (car == c) {
                    continue;
                }

                if (car.comparePosition(c)) {
                    c.setCrashed(true);
                    car.setCrashed(true);
                }

            }

        }
    }

}
