public class Rectangle {
    // instance variables
    private int length;
    private int width;
    private double rotAngle; 
    private Point corner1;
    private Point corner2;
    private Point corner3;
    private Point corner4;

    // constructors
    public Rectangle(int length, int width, double rotAngle, Point corner1, Point corner2, Point corner3, Point corner4) {
        this.length = length;
        this.width = width;
        this.rotAngle = rotAngle;
        this.corner1 = corner1;
        this.corner2 = corner2;
        this.corner3 = corner3;
        this.corner4 = corner4;
    }

    public Rectangle() {
        length = 2;
        width = 1;
        rotAngle = 0;
        corner1 = new Point(0,0);
        corner2 = new Point(0,1);
        corner3 = new Point(1,2);
        corner4 = new Point(2,0);
    }

    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


    // setters
    public void setLength(int input) {
        length = input;
    }

    public void setWidth(int input) {
        width = input;
    }

    // methods
    public String toString() {
        return "This rectangle has a width of " + width + " and a length of " + length + ".";
    }

    public boolean equals(Rectangle other) {
        return this.width == other.width && this.length == other.length;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateDiagonal() {
        return Math.sqrt((Math.pow(length, 2) + Math.pow(width, 2)));
    }

    public void rotateCorners() {

    }







}