public class _15_NLetterTriangle {

//    A B C D E
//    A B C D
//    A B C
//    A B
//    A

    public static void main(String[] args) {
        nLetterTriangle(5);
    }

    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int r = n; r >= 1; r--) {
            int count = 'A';
            for (int c = 1; c <= r; c++) {
                System.out.print(((char) count++) + " ");
            }
            System.out.println();
        }

    }
}
