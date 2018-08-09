package se.javierdlc;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Shape{
    protected Point start;
    protected Point end;

    public Rectangle(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public List<Point> draw() {
        List<Point> points = new ArrayList<>();
        int[] horizontal = new int[]{start.getY(),end.getY()};
        int[] vertical = new int[]{start.getX(),end.getX()};
        for(int x:vertical){
            for (int i = start.getY(); i < end.getY()+1; i++) {
                points.add(new Point(x,i));
            }
        }
        for(int y:horizontal){
            for (int i = start.getX(); i < end.getX(); i++) {
                points.add(new Point(i,y));
            }
        }
        return points;
    }
}
