public class _6_NNumberTriangle {

//            1 2 3 4
//            1 2 3
//            1 2
//            1

    public static void main(String[] args) {
        nNumberTriangle(4);
    }

    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
