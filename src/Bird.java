package src;

import java.awt.Image;

public class Bird {
    int boardWidth = 360;
    int boardHeight = 640;

    int x = boardWidth / 8;
    int y = boardHeight / 2;
    int width = 34;
    int height = 24;
    Image img;

    Bird(Image img) {
        this.img = img;
    }
}
