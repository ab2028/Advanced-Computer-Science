public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(1, 2);
        Rectangle rect2 = new Rectangle(3, 4);

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());


        rect1.setWidth(5);
        rect2.setLength(1);

        rect1.getWidth();
        rect2.getLength();
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

        System.out.println("Rectangle 1 = Rectangle 2 is " + rect1.equals(rect2) + ".");

        System.out.println("Rectangle 1 Diagonal: " + rect1.calculateDiagonal());
        System.out.println("Rectangle 2 Diagonal: " + rect2.calculateDiagonal());
    }


    
}
