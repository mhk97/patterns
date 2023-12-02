public class _5_Seeding {

//            * * * *
//            * * *
//            * *
//            *

    public static void main(String[] args) {
        seeding(4);
    }

    public static void seeding(int n) {
        // Write your code here
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
