public class _9_NStarDiamond {

//            *
//           ***
//          *****
//          *****
//           ***
//            *

    public static void main(String[] args) {
        nStarDiamond(3);
    }

    public static void nStarDiamond(int n) {
        // Write your code here
        int gap = n - 1, stars = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= gap; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= stars; c++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
            gap--;
        }

        int gap1 = 0, stars1 = 2 * n - 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= gap1; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= stars1; c++) {
                System.out.print("*");
            }
            System.out.println();
            stars1 -= 2;
            gap1++;
        }
    }
}
