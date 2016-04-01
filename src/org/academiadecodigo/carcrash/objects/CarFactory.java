package org.academiadecodigo.carcrash.objects;

public class CarFactory {

    private CarType carType;
    private static int copCarCounter = 0;

    /**
     * CarFactory Constructor
     */
    public CarFactory(CarType carType) {
        this.carType = carType;
    }


    private static int generateRandom() {
        return (int) (Math.random() * (CarType.values().length));
    }


    /**
     * Create Car Types
     */
    public static CarType getCarType() {
        int index = generateRandom();

        return CarType.values()[index];
    }

    public static Car getNewCar() {

        Car car = null;

        switch (getCarType()) {
            case COPCAR:
                if (copCarCounter < 3) {
                    car = new CopCar();
                    copCarCounter++;
                    break;
                }
            case COUPE:
                car = new Coupe();
                break;
            case JAZZ:
                car = new Jazz();
                break;
        }


// Testing:
        System.out.println(getCarType());
        return car;
    }
}