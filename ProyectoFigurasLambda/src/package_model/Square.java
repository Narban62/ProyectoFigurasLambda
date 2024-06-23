package package_model;

import package_interfaces.IDrawable;

import java.awt.*;

public class Square implements IDrawable {
    @Override
    public void draw(Graphics g) {
        drawSquare.draw(g);
    }
}
