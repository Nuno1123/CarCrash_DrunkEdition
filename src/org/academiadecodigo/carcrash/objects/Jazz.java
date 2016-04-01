package org.academiadecodigo.carcrash.objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 02/02/16.
 */
public class Jazz extends Car {


    public Jazz() {
        super(CarType.JAZZ, 2);

        String[] paths = new String[]{"jazz_north.png",
                "drunkJazz_north.png",
                "jazz_south.png",
                "drunkJazz_south.png",
                "jazz_west.png",
                "drunkJazz_west.png",
                "jazz_east.png",
                "drunkJazz_east.png",
                "rip.png",
                "busted.png"};

        Picture[] pictures = new Picture[10];

        pictures[0] = new Picture(getRep().getX(), getRep().getY(), paths[0]);
        pictures[1] = new Picture(getRep().getX(), getRep().getY(), paths[1]);
        pictures[2] = new Picture(getRep().getX(), getRep().getY(), paths[2]);
        pictures[3] = new Picture(getRep().getX(), getRep().getY(), paths[3]);
        pictures[4] = new Picture(getRep().getX(), getRep().getY(), paths[4]);
        pictures[5] = new Picture(getRep().getX(), getRep().getY(), paths[5]);
        pictures[6] = new Picture(getRep().getX(), getRep().getY(), paths[6]);
        pictures[7] = new Picture(getRep().getX(), getRep().getY(), paths[7]);
        pictures[8] = new Picture(getRep().getX(), getRep().getY(), paths[8]);
        pictures[9] = new Picture(getRep().getX(), getRep().getY(), paths[9]);

        getRep().setPictures(pictures);

        if (isSober()) {
            super.getRep().setCurrentPicture(pictures[0]);
        } else {
            super.getRep().setCurrentPicture(pictures[1]);
        }

        super.setPos();
        super.getRep().getCurrentPicture().draw();
    }

}


