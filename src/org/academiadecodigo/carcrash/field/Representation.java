package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Representation {


    private int x;
    private int y;
    private Picture currentPicture;
    private Picture[] pictures;
    private Picture[] picturesPowerUp;

    /**
     * Getters and Setters for "X" and "Y"
     */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }


    /**
     * Sets Power Ups Pictures Array
     * @param picturesPowerUp
     */
    public void setPicturesPowerUp(Picture[] picturesPowerUp) {
        this.picturesPowerUp = picturesPowerUp;
    }

    /**
     * Sets Cars Pictures Array
     * @param pictures
     */
    public void setPictures(Picture[] pictures) {
        this.pictures = pictures;
    }

    /**
     * Gets Current Picture
     * @return
     */
    public Picture getCurrentPicture() {
        return currentPicture;
    }

    /**
     * Sets Current Picture
     * @param currentPicture
     */
    public void setCurrentPicture(Picture currentPicture) {
        this.currentPicture = currentPicture;
    }


    /**
     * Changes Picture to RIP Picture
     */
    public void die(){
        changePicture(8);
    }

    /**
     * Changes Picture to Busted Picture
     */
    public void busted(){
        changePicture(9);
    }


    /**
     * Changes Picture
     * @param i
     */
    public void changePicture(int i){
        currentPicture.delete();
        pictures[i].draw();
        setCurrentPicture(pictures[i]);
    }

    /**
     * Translates Cars Pictures
     * @param dx
     * @param dy
     */
    public void translate(int dx, int dy){
        for (Picture picture: pictures){
            picture.translate(dx,dy);
        }
    }

    /**
     * Translates Power Ups Pictures
     * @param dx
     * @param dy
     */
    public void translatePowerUp(int dx, int dy){
        for (Picture picture : picturesPowerUp) {
            picture.translate(dx,dy);
        }
    }


    /**
     * Car Move Representation
     * @param dir
     */
    public void update(Direction dir) {

        int dx = 0;
        int dy = 0;

        int carWidth = currentPicture.getWidth();
        int carHeight = currentPicture.getHeight();

        switch (dir) {
            //if direction changes to North:
            case NORTH:

                if (y - 1 < 10) {
                    y = 10;
                } else {
                    y --;
                    dy --;
                }
                break;

            //if direction changes to South:
            case SOUTH:

                if (y + 1 > Field.height - (carHeight)) {
                    y = Field.height - (carHeight);
                } else {
                    y ++;
                    dy ++;
                }
                break;

            //if direction changes to West:
            case WEST:

                if (x - 1 < 10) {
                    x = 10;
                } else {
                    x --;
                    dx --;
                }
                break;

            //if direction changes to East:
            case EAST:

                if (x + 1 > Field.width - (carWidth)) {
                    x = Field.width - (carWidth);
                } else {
                    x ++;
                    dx ++;
                }
                break;
        }
        translate(dx,dy);
    }
}
