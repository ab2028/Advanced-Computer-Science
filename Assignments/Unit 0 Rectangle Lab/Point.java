public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
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

    public void rotatePoint(double degrees) {
        double convDeg = Math.toRadians(degrees);
        x = (x * Math.cos(convDeg) - y * Math.sin(convDeg));
        y = (x * Math.sin(convDeg) + y * Math.cos(convDeg));
    }


}
