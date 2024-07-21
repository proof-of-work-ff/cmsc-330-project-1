// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Class that defines a solid isosceles triangle

public class IsoscelesTriangle extends SolidPolygon {
    public IsoscelesTriangle(Color color, Point top, int height, int width) {
        super(color, 3);
        int[] x_points = {top.x, top.x + width / 2, top.x - width / 2};
        int[] y_points = {top.y, top.y + height, top.y + height};
        createPolygon(x_points, y_points);
    }
}
