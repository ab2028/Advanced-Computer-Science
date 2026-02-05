public class MatrixFun {
    private int[][] matrix;


    // constructors

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Number of rows and columns must be nonnegative.");
        }
        matrix = fillMatrix(new int[numberOfRows][numberOfCols]);
    }

    public MatrixFun(int[][] starterMatrix) {
        matrix = starterMatrix;
        validateMatrix();
    }

    public MatrixFun() {
        matrix = fillMatrix(new int[3][3]);
    }

    public int[][] fillMatrix(int[][] mx) {
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                mx[i][j] = (int) (Math.random() * 10);
            }
        }
        return mx;
    }

    // if matrix is not rectangular, print warning to console
    public void validateMatrix() {
        int rowLength = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length != rowLength) {
                System.out.println("Warning: The matrix is not rectangular.");
                return;
            }
        }

    }


    // getters and setters

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // methods

    public String toString() {
        String result = "=".repeat(matrix[0].length * 2 - 1);
        result += "\n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j] + " ";
            }
            result += "\n";

        }
        result += "=".repeat(matrix[0].length * 2 - 1);

        return result;
    }

    public boolean equals(MatrixFun other) {
        return this.toString().equals(other.toString());
    }

    public boolean equals(int[][] matrix) {
        if (this.matrix.length != matrix.length) {
            return false;
        }
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.matrix[i].length != matrix[i].length) {
                return false;
            }
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (this.matrix[i][j] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowA >= matrix.length || rowB < 0 || rowB >= matrix.length) {
            throw new IllegalArgumentException("Row indices are out of bounds.");
        }
        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }



}
