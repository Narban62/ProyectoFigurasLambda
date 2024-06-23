package package_model;

import package_interfaces.IDrawable;

import java.awt.*;

public class Circle implements IDrawable {
    @Override
    public void draw(Graphics g) {
        drawCircle.draw(g);
    }
}
