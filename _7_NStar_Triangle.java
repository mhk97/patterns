public class _7_NStar_Triangle {

//                *
//               ***
//              *****
//             *******

    public static void main(String[] args) {
        nStarTriangle(4);
    }

    public static void nStarTriangle(int n) {
        // Write your code here
        for (int row = 1; row <= n; row++) {
            //space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= (2 * row) - 1; col++) {
                System.out.print("*");
            }

            //spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
