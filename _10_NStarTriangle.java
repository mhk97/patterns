public class _10_NStarTriangle {

    //            *
//            **
//            ***
//            **
//            *
    public static void main(String[] args) {
        nStarTriangle(3);
    }

    public static void nStarTriangle(int n) {
        // Write your code here
        int stars = 1;
        for (int r = 1; r <= 2 * n - 1; r++) {
            for (int c = 1; c <= stars; c++) {
                System.out.print("*");
            }
            System.out.println();
            if (r < n) stars++;
            else stars--;
        }
    }
}
