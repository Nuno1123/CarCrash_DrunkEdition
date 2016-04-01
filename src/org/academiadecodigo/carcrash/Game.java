package org.academiadecodigo.carcrash;


import org.academiadecodigo.carcrash.objects.*;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    public static final int MANUFACTURED_CARS = 15;
    public static final int POWERUPS = 16;


    /**
     * Container of Cars
     */
    Car[] cars;
    PowerUp[] powerUps;

    /**
     * Animation delay
     */
    int delay;

    public Game(int x, int y, int delay) {

        Field.init(x, y);
        this.delay = delay;
    }

    /**
     * Creates a bunch of objects and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        powerUps = new PowerUp[POWERUPS];
        CollisionDetector collisionDetector = new CollisionDetector(cars);
        PoliceRadar policeRadar = new PoliceRadar(cars);
        PowerUpDetector powerUpDetector = new PowerUpDetector(cars, powerUps);

        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
            cars[i].setCollisionDetector(collisionDetector);
            cars[i].setPoliceRadar(policeRadar);
            cars[i].setPowerUpDetector(powerUpDetector);
        }

        for (int i = 0; i < powerUps.length; i++) {
            powerUps[i] = PowerUpFactory.getNewPowerUpType();
        }
    }

    /**
     * Starts the animation
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            boolean allCarsCaput = true;

            // Move all objects
            for (Car c : cars) {

                if (!c.isCrashed() && (!c.isBusted())) {
                    c.moveCar();

                }
                if (!(c instanceof CopCar) && !c.isCrashed() && (!c.isBusted())) {
                    allCarsCaput = false;
                }
            }
            if (allCarsCaput){
                break;
            }
        }

        Picture gameOver = new Picture(10, 10, "gameover.png");
        gameOver.draw();

    }




}
