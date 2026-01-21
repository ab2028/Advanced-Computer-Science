public class ForEachDemo {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};


        for (int i = 0; i < x.length; i++) {
            System.out.println(i);
        }

        // "for each number in the list x"
        for (int number : x) {
            System.out.println(number);
        }

        String names[] = {"Beverly", "Levi", "Ava", "Boyan"};

        for (String name : names) {
            name = ("hello, " + name); // strings are immutable!
            // even if this was a primitive data type, this would not change the original array
            // it can modify regular objects
            // name is a local variable; just a copy
            // instead use an index-based for loop to modify the original array
        }

        for (String string : names) {
            System.out.println(string);
        }
    }
    
}
