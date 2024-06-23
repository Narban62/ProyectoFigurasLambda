package package_model;

import package_interfaces.IDrawable;

import java.awt.*;

public class Triangle implements IDrawable {
    @Override
    public void draw(Graphics g) {
        drawTriangle.draw(g);
    }
}
