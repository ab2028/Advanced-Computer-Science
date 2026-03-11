import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangle extends Shape {

    public Triangle(int[] xCoord, int[] yCoord) {
        super(xCoord, yCoord);
    }

    @Override
    public void draw(Graphics g){

        Graphics2D g2D = (Graphics2D) g; //initializes a 2D graphics component
        g2D.setPaint(Color.cyan); // sets the paint color to cyan
        g.fillPolygon(xCoord, yCoord, xCoord.length); // draws a polygon filled with the paint color

        g2D.setPaint(Color.blue); // sets the paint color to blue
        g2D.setStroke(new BasicStroke(5)); // changes the line stroke width to 5

        g.drawPolygon(xCoord, yCoord, xCoord.length); // draws a polygon outline with the paint color and stroke width
    }
    
}
