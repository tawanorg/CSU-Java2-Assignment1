package tawan;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class EquilateralTrianglesPanel extends JPanel {

    int windowWidth;
    int windowHeight;

    Shape triangleShape;
    Polygon polygon;

    public EquilateralTrianglesPanel(
            int windowWidth,
            int windowHeight
    ) {
        // Set window size
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;

        // create triangle shape
        triangleShape = new TriangleShape(
                new Point2D.Double(50, 0),
                new Point2D.Double(100, 100),
                new Point2D.Double(0, 100)
        );

        // create upside down triangle shape
        polygon = new Polygon(
                new int[] { 0, 100, 50 },
                new int[] { 0, 0, 100 },
                3);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();

        paint2d(g2d, 150, 0, Color.RED);
        paint2d(g2d, -50, 100, Color.GREEN);
        paint2d(g2d, 100, 0, Color.BLUE);

        paintPoly(g2d, -50, 0, Color.YELLOW);

        g2d.dispose();
    }


    private void paint2d(Graphics2D g2d, int x, int y, Color color) {
        g2d.setColor(color);
        g2d.translate(x, y);
        g2d.fill(triangleShape);
    }

    private void paintPoly(Graphics2D g2d, int x, int y, Color color) {
        g2d.setColor(color);
        g2d.translate(x, y);
        g2d.fill(polygon);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(this.windowWidth, this.windowHeight);
    }

}
