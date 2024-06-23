package package_controller;

import package_interfaces.IDrawable;
import package_model.Circle;
import package_model.Square;
import package_model.Triangle;

import javax.swing.*;
import java.awt.*;

public class Container  extends JPanel {

    Circle circle = new Circle();
    Square square = new Square();
    Triangle triangle = new Triangle();

    private IDrawable currentFigure;

    public void setFigure(String figureType) {
        switch (figureType) {
            case "Circle":
                currentFigure = circle;
                break;
            case "Square":
                currentFigure = square;
                break;
            case "Triangle":
                currentFigure = triangle;
                break;
        }
        repaint();
    }

    public void clear() {
        currentFigure = null;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {

        if (currentFigure != null) {
            currentFigure.draw(g);
        }
    }


    public Container() {

    }


}
