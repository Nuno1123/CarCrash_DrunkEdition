package org.academiadecodigo.carcrash.objects;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Representation;

/**
 * Created by codecadet on 11/02/16.
 */
public class PowerUp {

    private PowerUpType powerUpType;
    private Representation rep = null;
    private boolean isUsed = false;

    public PowerUp(PowerUpType powerUpType) {
        this.powerUpType = powerUpType;
        rep = new Representation();

    }

    public Representation getRep() {
        return rep;
    }

    //RandomGenerator:
    public static int generateRandom(int min, int max) {
        return ((int) (Math.random() * (max - min + 1) + min));
    }

    public void setPos() {

        int x = generateRandom(10, Field.width - rep.getCurrentPicture().getWidth());
        int y = generateRandom(10, Field.height - rep.getCurrentPicture().getHeight());

        rep.setX(x);
        rep.setY(y);

        this.getRep().translatePowerUp(x, y);

    }

    public boolean isUsed(){
        return isUsed;
    }

    public void setUsed() {
        isUsed = true;
    }
}
