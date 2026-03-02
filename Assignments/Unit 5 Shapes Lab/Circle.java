import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {
    private int radius;

    public Circle(int xCoord, int yCoord, int radius) {
        super(xCoord, yCoord);
        this.radius = radius;

    }

    public Circle(int radius) {
        this(0, 0, 0);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void draw(Graphics g) {
        // Initialize a Graphics 2D object
        Graphics2D g2D = (Graphics2D) g;
        // Set the color of the circle
        g2D.setPaint(Color.blue);
        // Draw the circle using the fillOval method
        g2D.fillOval(xCoord, yCoord, radius, radius);

        // set the color of the circle
        g2D.setPaint(Color.orange);
        // change the stroke width
        g2D.setStroke(new BasicStroke(5));
        // draw the circle using the drawOval method
        g2D.drawOval(xCoord, yCoord, radius, radius);

    }

    @Override
    public String toString() {
        return super.toString() + "It is a circle with a radius of " + this.radius
                + ". Its area is " + this.getArea() + ".";
    }

}
