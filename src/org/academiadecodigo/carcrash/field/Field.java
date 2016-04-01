package org.academiadecodigo.carcrash.field;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public final class Field {

    public static int width;
    public static int height;

    //This class is not supposed to be instantiated
    private Field() {
    }

    /**
     * Initializes the Background
     * @param width
     * @param height
     */
    public static void init(int width, int height) {

        // Create the GUI
        Picture pic = new Picture(10, 10, "background.png");

        pic.draw();

        // Set field size
        Field.width = pic.getWidth();
        Field.height = pic.getHeight();

    }
}


