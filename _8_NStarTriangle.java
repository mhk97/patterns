public class _8_NStarTriangle {

//    *********
//     *******
//      *****
//       ***
//        *

    public static void main(String[] args) {
        nStarTriangle(5);
    }

    public static void nStarTriangle(int n) {
        // Write your code here
        for (int r = n; r >= 1; r--) {


            for (int c = 1; c <= n - r; c++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= (2 * r) - 1; c++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
