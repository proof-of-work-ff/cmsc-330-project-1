// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Class that defines a solid regular polygon

public class RegularPolygon extends SolidPolygon {
    public RegularPolygon(Color color, int sides, Point center, int radius) {
        super(color, sides);
        int[] x_points = new int[sides];
        int[] y_points = new int[sides];

        double centerAngle = Math.toRadians(360 / sides);
        for (int i = 0; i < sides; i++) {
            x_points[i] = center.x + (int) (radius * Math.cos(centerAngle * i));
            y_points[i] = center.x + (int) (radius * Math.sin(centerAngle * i));
        }
        createPolygon(x_points, y_points);
    }
}
