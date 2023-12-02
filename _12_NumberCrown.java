public class _12_NumberCrown {

//            1       1
//            1 2     2 1
//            1 2 3   3 2 1
//            1 2 3 4 4 3 2 1

    public static void main(String[] args) {
        numberCrown(4);
    }

    public static void numberCrown(int n) {
        // Write your code here.

        int gap = 2 * n - 2;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            for (int c = 1; c <= gap; c++) {
                System.out.print(" ");
            }
            for (int c = r; c >= 1; c--) {
                System.out.print(c + " ");
            }
            System.out.println();
            gap -= 2;
        }
    }
}
