public class SkyView {
    private double[][] view;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (scanned.length > numberOfRows * numberOfCols) {
            throw new IllegalArgumentException(); // REV
        }
        this.view = new double[numberOfRows][numberOfCols];
        int index = 0;

        for (int r = 0; r < numberOfRows; r++) {

            if (r % 2 == 0) {
                // even row: left -> right
                for (int c = 0; c < numberOfCols; c++) {
                    view[r][c] = scanned[index];
                    index++;
                }
            } else {
                // odd row: right -> left
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[index];
                    index++;
                }
            }

        }


    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public String toString() {
        String result = "";
        for (double[] r : view) {
            for (double c : r) {
                result += c + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean equals(SkyView other) {
        if (other == null) {
            return false;
        }
        if (view.length != other.view.length) {
            return false;
        }
        if (view[0].length != other.view[0].length) {
            return false;
        }
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                if (view[r][c] != other.view[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || startRow > endRow || endRow >= view.length) { // ? REV
            throw new IllegalArgumentException();
        }
        if (startCol < 0 || startCol > endCol || endCol >= view[0].length) {
            throw new IllegalArgumentException();
        }

        double sum = 0;

        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
            }
        }

        return sum / ((endRow - startRow + 1) * (endCol - startCol + 1));
    }
}
