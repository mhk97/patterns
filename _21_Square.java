public class _21_Square {

    //            ****
    //            *  *
    //            *  *
    //            ****
    public static void main(String[] args) {
        getStarPattern(4);
    }

    public static void getStarPattern(int n) {
        // Write your code here
        for (int r = 1; r <= n; r++) {
            if (r == 1 || r == n) {
                for (int c = 1; c <= n; c++) {
                    System.out.print("*");
                }
            } else {
                for (int c = 1; c <= n; c++) {
                    if (c == 1 || c == n) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
