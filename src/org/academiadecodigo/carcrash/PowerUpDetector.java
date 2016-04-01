package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.objects.*;

/**
 * Created by dora on 13-02-2016.
 */
public class PowerUpDetector {

    private Car[] cars;
    private PowerUp[] powerUps;


    public PowerUpDetector(Car[] cars, PowerUp[] powerUps) {
        this.cars = cars;
        this.powerUps = powerUps;
    }

    public void checkPowerUpsAquisition(Car car) {

        for (Car c : cars) {

            for (PowerUp p : powerUps) {
                if (p instanceof Bottle) {

                    if (c.isSober() && (p.isUsed() == false)) {
                        if (c.comparePositionPowerUp(p)) {
                            c.setStrengthDrink(70);
                            p.getRep().getCurrentPicture().delete();
                            c.chooseDirection();
                            p.setUsed();

                        }
                    }
                }
                else if (p instanceof Guronsan) {
                    if (c.isDrunk() && (p.isUsed() == false)) {
                        if (c.comparePositionPowerUp(p)) {
                            c.setStrengthDrink(0);
                            p.getRep().getCurrentPicture().delete();
                            c.chooseDirection();
                            p.setUsed();

                        }
                    }
                } else if (p instanceof SpeedBooster) {
                    if (c.getMoveCounter() <= 11 && (p.isUsed() == false)) {
                        if (c.comparePositionPowerUp(p)) {
                            c.speedBooster();
                            p.getRep().getCurrentPicture().delete();
                            p.setUsed();

                        }
                    }
                }
            }
        }
    }
}


