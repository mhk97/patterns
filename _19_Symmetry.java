public class _19_Symmetry {

//            ******
//            **  **
//            *    *
//            *    *
//            **  **
//            ******
    public static void main(String[] args) {
        symmetry(3);
    }

    public static void symmetry(int n) {
        // Write your code here
        int gap = 0;
        for (int r = 1; r <= 2 * n; r++) {
            int stars = (n >= r) ? n - r + 1 : r - n;
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
            if (r != n) gap = (r < n) ? gap + 2 : gap - 2;
        }
    }
}
