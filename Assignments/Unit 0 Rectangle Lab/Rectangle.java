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
        this.corner1 = new Point(0,0);
        this.corner2 = new Point(length, 0);
        this.corner3 = new Point(0,width);
        this.corner4 = new Point(length,width);
    }

    public Rectangle() {
        length = 2;
        width = 1;
        rotAngle = 0;
        this.corner1 = new Point(0,0);
        this.corner2 = new Point(length, 0);
        this.corner3 = new Point(0,width);
        this.corner4 = new Point(length,width);
    }

    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getRotAngle() {
        return rotAngle;
    }

    public Point getCorner1() {
        return corner1;
    }

    public Point getCorner2() {
        return corner2;
    }

    public Point getCorner3() {
        return corner3;
    }

    public Point getCorner4() {
        return corner4;
    }


    // setters
    public void setLength(int input) {
        length = input;
    }

    public void setWidth(int input) {
        width = input;
    }

    public double setRotAngle(double rotAngle) {
        this.rotAngle = rotAngle;
    }

    public void setCorner1(Point corner1) {
        this.corner1 = corner1;
    }

    public void setCorner2(Point corner2) {
        this.corner2 = corner2;
    }

    public void setCorner3(Point corner3) {
        this.corner3 = corner3;
    }

    public void setCorner4(Point corner4) {
        this.corner4 = corner4;
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

    

    public void rotateCorners(double degrees) {
        rotAngle = degrees;
        corner1.rotatePoint(degrees);
        corner2.rotatePoint(degrees);
        corner3.rotatePoint(degrees);
        corner4.rotatePoint(degrees);
    }

    

    







}