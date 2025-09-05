public class Rectangle {
    // instance variables
    private int length;
    private int width;

    // constructors
    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;

    }

    //public Rectangle() { //space or no space after { ?}

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







}