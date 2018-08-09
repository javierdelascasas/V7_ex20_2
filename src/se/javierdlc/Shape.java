package se.javierdlc;

import java.util.List;

public abstract class Shape {
    private int r;
    private int g;
    private int b;

    public void setColor(int r, int g, int b) {
        setR(r);
        setG(g);
        setB(b);
    }

    public abstract List<Point> draw();

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
