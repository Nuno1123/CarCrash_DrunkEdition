package org.academiadecodigo.carcrash.objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 11/02/16.
 */
public class Guronsan extends PowerUp {

    public Guronsan() {

        super(PowerUpType.GURONSAN);

        String[] paths = new String[] {"drunkhealer.png"};
        Picture[] picturesPowerUp = new Picture[1];

        picturesPowerUp[0] = new Picture(getRep().getX(), getRep().getY(), paths[0]);

        getRep().setPicturesPowerUp(picturesPowerUp);

        super.getRep().setCurrentPicture(picturesPowerUp[0]);

        super.setPos();
        super.getRep().getCurrentPicture().draw();
    }

}
