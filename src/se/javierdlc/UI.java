package se.javierdlc;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.List;

public class UI {
    private Terminal terminal;

    public UI(Terminal terminal) {
        this.terminal = terminal;
    }

    public void drawShapes(List<Shape> shapes) {
        terminal.clearScreen();
        for (Shape shape : shapes) {
            List<Point> points = shape.draw();
            terminal.applyBackgroundColor(shape.getR(),shape.getG(),shape.getB());
            for (Point point : points) {
                terminal.moveCursor(point.getX(),point.getY());
                terminal.putCharacter(' ');
            }
        }
    }
}
