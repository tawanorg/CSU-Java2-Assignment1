/**
 * Write a GUI program that displays four equilateral triangles inside a larger equilateral triangle
 *
 * @author Tawan Chotikanchinda <hello@tawan.org>
 */

package tawan;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class Main extends Application {
    // The window containing the triangle should measure 400 * 200.
    final int windowWidth = 400;
    final int windowHeight = 200;

    //  Design your window so that the user is not able to resize it.
    final boolean isResizable = false;

    @Override
    public void start(Stage primaryStage) throws Exception{
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new EquilateralTrianglesPanel(
            windowWidth,
            windowHeight
        ));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        launch(args);
    }

}


