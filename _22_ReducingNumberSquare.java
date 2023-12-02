public class _22_ReducingNumberSquare {

//            4 4 4 4 4 4 4
//            4 3 3 3 3 3 4
//            4 3 2 2 2 3 4
//            4 3 2 1 2 3 4
//            4 3 2 2 2 3 4
//            4 3 3 3 3 3 4
//            4 4 4 4 4 4 4

    public static void main(String[] args) {
        getNumberPattern(4);
    }

    public static void getNumberPattern(int n) {
        // Write your code here.
        for (int r = 1; r <= 2 * n - 1; r++) {
            for (int c = 1; c <= 2 * n - 1; c++) {
                int top = r - 1;
                int bottom = 2 * n - r - 1;
                int left = c - 1;
                int right = 2 * n - c - 1;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }
}
