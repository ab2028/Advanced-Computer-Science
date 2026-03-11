import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        // to-do: draw the house!

        // Adds shapes to an ArrayList, converting them all to Polygons
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // chimney
        shapes.add(new Rectangle(150, 75, 50, 60));
        shapes.get(0).setFillColor(Color.cyan);
        shapes.get(0).setStrokeColor(Color.blue);


        // building
        shapes.add(new Rectangle(125, 125, 250, 250));
        shapes.get(1).setFillColor(Color.blue);



        // door
        shapes.add(new Rectangle(175, 250, 50, 125));
        shapes.get(2).setFillColor(Color.orange);
        shapes.get(2).setStrokeColor(Color.red);

        // roof
        shapes.add(new Triangle(new int[]{125, 250, 375}, new int[]{125, 75, 125}));

        // sun
        shapes.add(new Oval(60, 50, 50, 50));
        shapes.get(4).setFillColor(Color.cyan);
        shapes.get(4).setStrokeColor(Color.blue);

        // window
        shapes.add(new Rectangle(300, 175, 50, 50));
        shapes.get(5).setFillColor(Color.orange);
        shapes.get(5).setStrokeColor(Color.red);



        // Draws all the shapes in the ArrayList using that shape's draw method
        for (Shape p : shapes) {
            p.draw(g);
        }


    }


}
