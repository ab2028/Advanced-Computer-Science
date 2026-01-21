public class MatrixFun {
    private int[][] matrix;



    public MatrixFun(int numberOfRows, int numberOfCols) {
        matrix = new int[numberOfRows][numberOfCols];
        fillMatrix();
    }

    public MatrixFun(int[][] starterMatrix) {
        matrix = starterMatrix;

    }

    public void fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
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


}
