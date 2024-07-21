// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Class that defines all solid polygons

class SolidPolygon extends Polygon_ {

    // Constructor that initializes color and vertexCount of a SolidPolygon

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.fillPolygon(polygon);
    }
}
