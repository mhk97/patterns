public class _14_NLetterTriangle {

//    A
//    A B
//    A B C
//    A B C D

    public static void main(String[] args) {
        nLetterTriangle(4);
    }

    public static void nLetterTriangle(int n) {
        // Write your code here

        for (int r = 1; r <= n; r++) {
            int count = 'A';
            for (int c = 1; c <= r; c++) {
                System.out.print(((char) count++) + " ");
            }
            System.out.println();
        }
    }
}
