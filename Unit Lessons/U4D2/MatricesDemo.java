public class MatricesDemo {
    public static void main(String[] args) {
        // 3d matrices are also possible
        int[][] table = new int[3][4];

        table[1][2] = 50;

        for (int[] row : table) {
            for (int cell : row) {
                System.out.print(cell + "\t");

            }
            System.out.println();
        }
        // irregular matrix, the rows are not the same length, so be careful accessing their elements
        int[][] fun = {{1,2,3}, {4,5}, {6,7,8}};
        // index out of bounds exception for fun[1][2]

        // if you have to use a 3d array, you're probably doing something wrong
        // no practical uses in most cases


    }
}

