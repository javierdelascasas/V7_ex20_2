package se.javierdlc;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape{
    protected Point origo;
    protected int radius;

    public Circle(Point origo, int radius) {
        this.origo = origo;
        this.radius = radius;
    }

    @Override
    public List<Point> draw() {
        List<Point> points = new ArrayList<>();
        for (int x = origo.getX()-radius; x < origo.getX()+radius; x++) {
            int y = (int)(origo.getY() + Math.sqrt(Math.pow(radius,2) - Math.pow(x-origo.getX(),2)));
            points.add(new Point(x,y));
            y = (int)(origo.getY() - Math.sqrt(Math.pow(radius,2) - Math.pow(x-origo.getX(),2)));
            points.add(new Point(x,y));
        }
        return points;
    }
}
