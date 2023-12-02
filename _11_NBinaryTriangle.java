public class _11_NBinaryTriangle {

//            1
//            0 1
//            1 0 1
//            0 1 0 1

    public static void main(String[] args) {
        nBinaryTriangle(4);
    }

    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                if ((r + c) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
