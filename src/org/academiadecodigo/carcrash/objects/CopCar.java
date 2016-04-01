package org.academiadecodigo.carcrash.objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 02/02/16.
 */
public class CopCar extends Car {


    public CopCar() {
        super(CarType.COPCAR, 5);

        String[] paths = new String[] {"copCar_north.png",
                "/drunkCopCar_north.png",
                "copCar_south.png",
                "drunkCopCar_south.png",
                "copCar_west.png",
                "drunkCopCar_west.png",
                "copCar_east.png",
                "drunkCopCar_east.png",
                "rip.png",
                "busted.png"
        };

        Picture[] pictures = new Picture[] {

                new Picture(getRep().getX(), getRep().getY(), paths[0]),
                new Picture(getRep().getX(), getRep().getY(), paths[1]),
                new Picture(getRep().getX(), getRep().getY(), paths[2]),
                new Picture(getRep().getX(), getRep().getY(), paths[3]),
                new Picture(getRep().getX(), getRep().getY(), paths[4]),
                new Picture(getRep().getX(), getRep().getY(), paths[5]),
                new Picture(getRep().getX(), getRep().getY(), paths[6]),
                new Picture(getRep().getX(), getRep().getY(), paths[7]),
                new Picture(getRep().getX(), getRep().getY(), paths[8]),
                new Picture(getRep().getX(), getRep().getY(), paths[9])
        };

        getRep().setPictures(pictures);

        if (isSober()) {
            super.getRep().setCurrentPicture(pictures[0]);
        } else {
            super.getRep().setCurrentPicture(pictures[1]);
        }

        super.getRep().setCurrentPicture(pictures[0]);

        super.setPos();
        super.getRep().getCurrentPicture().draw();
    }


    @Override
    public void setDrinkEffect() {
    }

    @Override
    public boolean isCrashed() {
        return false;
    }
}