package package_interfaces;

import java.awt.*;

@FunctionalInterface
public interface IDrawable {

    IDrawable drawCircle = (Graphics g) -> {
        g.setColor(Color.BLUE);
        g.fillOval(100, 100, 100, 100);
        System.out.println("Circle drawn");
    };

    IDrawable drawSquare = (Graphics g) -> {
        g.setColor(Color.RED);
        g.fillRect(100, 100, 100, 100);
        System.out.println("Square drawn");
    };

    IDrawable drawTriangle = (Graphics g) -> {
        g.setColor(Color.GREEN);
        int[] x = {100, 200, 150};
        int[] y = {200, 200, 100};
        g.fillPolygon(x, y, 3);
        System.out.println("Triangle drawn");
    };

    void draw(Graphics g);

}

