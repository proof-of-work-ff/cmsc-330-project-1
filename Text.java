// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Class that defines a text

public class Text extends Image {
    private Point location;
    private String text;

    public Text(Color color, Point location, String text) {
        super(color);
        this.location = location;
        this.text = text;
    }

    @Override
    void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(text, location.x, location.y);
    }
}
