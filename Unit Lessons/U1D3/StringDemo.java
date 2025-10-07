public class StringDemo {

    // in the AP only use these methods from this class
    // regular teachers, not computer science teachers, grade these tests

    public static void main(String[] args) {
        // Strings are objects
        String fullName = "Ava Berenji";
        String fullName2 = "Ava Berenji"; // they point to the same object; variables pointing to a
                                          // spot in memory (?)
        fullName2 = "Ava B"; // now fullName2 is a different object
        String fullName3 = new String("Ava Berenji"); // this is a different object bc "new"

        // fullName3 += ":)";

        // STRINGS ARE IMMUTABLE - cannot be changed
        // Any change immediately creates a new string object


        // string pool - list of all strings being "used" in the program

        // imagine if you create two dog objects with new Dog();, then it's two because it's a copy.
        // but this is different?

        // methods
        // charAt() -> returns the char value at index
        // "Ava Berenji"
        System.out.println(fullName.charAt(3)); // fourth character! (index 3; starts at 0)

        // indexOf() - returns the index of a char value; FIRST OCCURENCE (like stops after it finds
        // it)
        System.out.println(fullName.indexOf('B')); // 4

        // "Ava B"
        System.out.println(fullName2.indexOf("B")); // 4

        // Juan Antonio Lopez
        int firstSpace = fullName2.indexOf(" "); // 3
        String middleLastName = fullName2.substring(firstSpace); // create a substring starting at
                                                                 // the first space to the end; it
                                                                 // includes the space!

        System.out.println(middleLastName);

        System.out.println(middleLastName.indexOf("B")); // why don't we just say 'n' if we are
                                                         // lookin for a char?
        System.out.println(middleLastName.indexOf("z")); // -1 if not found; instead of breaking (so
                                                         // we can use convenient if statements)

        // compareTo() -> returns a number depending on the dictionary order; first nonzero
        // difference as you move through. helps with sorting alphabetically (i think mostly just
        // pairwise)
        String string1 = "abc";
        // String def = "def";
        String string2 = "abced";

        System.out.println(string2.compareTo(string1));
        // returns negative if abc is "before" abd
        // returns positive if abc is "after" [abd]
        // returns 0 if strings are equal
        // if one string is longer than the other, it returns the difference in length if all other
        // characters are the same
        // this makes sense because the shorter one would come first alphabetically



    }
}
