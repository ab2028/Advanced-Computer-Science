public class TriangleLoops {
        
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";

        for (int maxRow = 1; maxRow <= numberOfRows; maxRow++) {
            for (int letterCol = 1; letterCol <= maxRow; letterCol++) { 
                triangle += letter; 
            }
            if (maxRow < numberOfRows) { // avoid extra newline at end
                triangle += "\n";
            }
        }

        return triangle;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";

        for (int maxRow = numberOfRows; maxRow >= 1; maxRow--) {
            for (int letterCol = 1; letterCol <= maxRow; letterCol++) {
                triangle += letter;
            }
            if (maxRow > 1) { // avoid extra newline at end
                triangle += "\n";
            }
        }

        return triangle;
    }

    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";

        for (int maxRow = 1; maxRow <= numberOfRows; maxRow++) {
            for (int numberCol = 1; numberCol <= maxRow; numberCol++) {
                triangle += maxRow; // should int be casted? (like with "" + (...))
                if (numberCol < maxRow) { // add space between numbers
                    triangle += " ";
                }
            }
            if (maxRow < numberOfRows) { // avoid extra newline at end
                triangle += "\n";
            }
        }

        return triangle;
    }

    public static String createAlphabetTriangle(int numberOfRows) {
        if (numberOfRows > 26) { // precondition - cap at 26 letters
            numberOfRows = 26;
        } 

        String triangle = "";

        for (int maxRow = 1; maxRow <= numberOfRows; maxRow++) {

            // if n = 5, then 4, 3, 2, 1, 0 spaces
            for (int spaceCol = numberOfRows - maxRow; spaceCol > 0; spaceCol--) {
                triangle += " ";
            }

            // if maxRow = 4: ABCD
            for (int letterCol = 0; letterCol < maxRow; letterCol++) {
                triangle += (char) ('A' + letterCol);
            }

            // the for loop will stop b4 running if the -2 is out of range; no error
            // CBA
            for (int letterCol = maxRow - 2; letterCol >= 0; letterCol--) {
                triangle += (char) ('A' + letterCol); 
            }

            if (maxRow < numberOfRows) { // avoid extra newline at end
                triangle += "\n";
            }
        }

        return triangle;
    }

}


        

