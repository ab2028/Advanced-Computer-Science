public class Tester {
    public static void main(String[] args) {
        
        // PEMDAS
        // PBMEMDMASRCB
        // most of the last operators (comparison ones that output true/false) make sense intuitively

        // 1. Parenthesis, Brackets, Member Access (Methods)
        String demo = "hello";
        System.out.println(5*demo.length());

        // 1. Exponents (this is a method, so it is level 1)
        Math.pow(2, 4);

        // 3. Multiplication, Division, Modular Arithmetic
        System.out.println(5 * 4 + (5 / 6) + 7 % 1);


        // 4. Addition and Subtraction
        System.out.println(5 - 6 + 9);

        // 5. Relational Operators
        System.out.println(6 < 7);
        // <, <=, >=, >

    
        // 6. Comparison Operators
        System.out.println(8 == 9);
        // ==, !=

        // 7. Boolean Operators (logical operators?)
        // &&, ||

        System.out.println((3 + Integer.parseInt("123")) * 9 / 8 + 7 >= 5);
        // Challenge: give me the 7 operations in order of operations
        // 1. Integer.parseInt("123") = 123
        // 2. 3 + 123 = 126
        // 3. 126 * 9 = 1134
        // 4. 1134 / 8  = 141 (truncated)
        // 5. 141 + 7 = 148
        // 6. 148 >= 5 = true
        // 7. The final operation is system.out.println() = true
        // how are methods first but 7 is last? everything inside must be evaluated first



    }
}
