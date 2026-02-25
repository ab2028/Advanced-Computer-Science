public class Rectangle extends Polygon {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;

    }

    public Rectangle() {
        this(3, 4);
    }


    public double getArea() {
        return width * length;
    }

    public String toString() {
        super.toString();
        return "It is a Rectangle with a length of " + length + " and width of " + width
                + ". Its area is " + getArea() + ".";
    }


}
