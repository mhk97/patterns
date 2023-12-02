public class _1_nForest {

//            * * * *
//            * * * *
//            * * * *
//            * * * *

    public static void main(String[] args) {
        nForest(4);
    }

    public static void nForest(int n) {
        // Write your code here
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
