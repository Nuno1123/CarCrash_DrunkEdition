package org.academiadecodigo.carcrash.objects;

/**
 * Created by codecadet on 11/02/16.
 */
public class PowerUpFactory {

    private PowerUpType powerUpType;
    private static int bottleCounter = 0;
    private static int guronsanCounter = 0;
    private static int speedBoosterCounter = 0;


    /**
     * PowerUp Factory Construtor
     */
    public PowerUpFactory(PowerUpType powerUpType) {
        this.powerUpType = powerUpType;
    }


    /**
     * Create PowerUp Types
     */
    public static PowerUpType getPowerUpType() {
        int index = 0;
        return PowerUpType.values()[index];
    }

    public static PowerUp getNewPowerUpType() {

        PowerUp powerUp = null;

        switch (getPowerUpType()) {
            case BOTTLE:
                if (bottleCounter < 6) {
                    powerUp = new Bottle();
                    bottleCounter++;
                    break;
                }
            case GURONSAN:
                if (guronsanCounter < 6) {
                    powerUp = new Guronsan();
                    guronsanCounter++;
                    break;
                }
            case SPEEDBOOSTER:
                if (speedBoosterCounter < 4) {
                    powerUp = new SpeedBooster();
                    speedBoosterCounter++;
                    break;
                }
        }
        return powerUp;
    }
}