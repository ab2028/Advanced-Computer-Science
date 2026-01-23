public class MatrixFunTester {
    public static void main(String[] args) {

        MatrixFun mf0 = new MatrixFun(3, 2);
        System.out.println(mf0.toString());



        // test irregular matrix
        mf0.setMatrix(new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}});
        mf0.validateMatrix();



        MatrixFun mf1 = new MatrixFun();
        System.out.println(mf1.toString());

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        MatrixFun mf2 = new MatrixFun(arr);
        System.out.println(mf2.toString());

        System.out.println("Are mf1 and mf2 equal? " + mf1.equals(mf2));


        // test equals method with matrices
        System.out.println("Are mf2's matrix and arr equal? " + mf2.equals(arr));

        mf2.replaceAll(5, 0);
        System.out.println("After replacing 5 with 0 in mf2:");
        System.out.println(mf2.toString());

        mf2.swapRow(0, 2);
        System.out.println("After swapping row 0 and row 2 in mf2:");
        System.out.println(mf2.toString());
    }
}
