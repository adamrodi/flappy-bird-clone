package src;

import java.awt.Image;

public class Pipe {
    int boardWidth = 360;
    int boardHeight = 640;

    int x = boardWidth;
    int y = 0;
    int width = 64;    //scaled by 1 / 6
    int height = 512;
    Image img;
    boolean passed = false;

    Pipe(Image img) {
        this.img = img;
    }
}
