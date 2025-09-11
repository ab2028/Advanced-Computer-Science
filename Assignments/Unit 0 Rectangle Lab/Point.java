public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(double input) {
        x = input;
    }
    
    public void setY(double input) {
        y = input;
    }

    public String toString() {
        return "This point has coordinates (" + x + ", " + y + ").";
    }
}
