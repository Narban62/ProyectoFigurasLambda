package package_view;

import package_controller.Container;

import javax.swing.*;
import java.awt.*;

public class FiguresFrame extends JFrame {

    Container container = new Container();

    public FiguresFrame() {

        super("Figures");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panelRight = new JPanel();
        panelRight.setLayout(new GridLayout(5, 0));
        add(panelRight, BorderLayout.EAST);

        JButton circleButton = new JButton("Circle");
        circleButton.addActionListener(e -> container.setFigure("Circle"));
        panelRight.add(circleButton);

        JButton squareButton = new JButton("Square");
        squareButton.addActionListener(e -> container.setFigure("Square"));
        panelRight.add(squareButton);

        JButton triangleButton = new JButton("Triangle");
        triangleButton.addActionListener(e -> container.setFigure("Triangle"));
        panelRight.add(triangleButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> container.clear());
        panelRight.add(clearButton);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        panelRight.add(exitButton);

        add(container, BorderLayout.CENTER);



    }
}