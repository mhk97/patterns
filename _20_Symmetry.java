public class _20_Symmetry {

    //        *    *
    //        **  **
    //        ******
    //        **  **
    //        *    *
    public static void main(String[] args) {
        symmetry(3);
    }

    public static void symmetry(int n) {
        // Write your code here
        int gap = 2 * n - 2, stars = 1;
        for (int r = 1; r <= (2 * n - 1); r++) {
            for (int c = 1; c <= stars; c++) {
                System.out.print("*");
            }
            for (int c = 1; c <= gap; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= stars; c++) {
                System.out.print("*");
            }
            System.out.println();
            stars = (r < n) ? stars + 1 : stars - 1;
            gap = (r < n) ? gap - 2 : gap + 2;
        }
    }
}
