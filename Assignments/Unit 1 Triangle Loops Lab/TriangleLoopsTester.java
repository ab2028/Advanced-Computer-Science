public class TriangleLoopsTester {
    public static void main(String[] args) {
        
        // Test createLetterTriangleUp
        System.out.println("createLetterTriangleUp(3, 'A'):");
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'A'));
        System.out.println();

        System.out.println("createLetterTriangleUp(5, 'B'):");
        System.out.println(TriangleLoops.createLetterTriangleUp(5, 'B'));
        System.out.println();

        // Test createLetterTriangleDown
        System.out.println("createLetterTriangleDown(3, 'A'):");
        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A'));
        System.out.println();

        System.out.println("createLetterTriangleDown(5, 'B'):");
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'B'));
        System.out.println();

        // Test createNumbersTriangle 
        System.out.println("createNumbersTriangle(4):");
        System.out.println(TriangleLoops.createNumbersTriangle(4));
        System.out.println();

        // Test createAlphabetTriangle
        System.out.println("createAlphabetTriangle(5):");
        System.out.println(TriangleLoops.createAlphabetTriangle(5));
        System.out.println();
    }
}
