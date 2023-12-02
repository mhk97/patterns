public class _18_AlphaTriangle {

    //    D
    //    D C
    //    D C B
    //    D C B A
    public static void main(String[] args) {
        alphaTriangle(4);
    }

    public static void alphaTriangle(int n) {
        // Write your code here
        for (int r = 1; r <= n; r++) {
            int ch = 'A' + n - 1;
            for (int c = 1; c <= r; c++) {
                System.out.print(((char) ch--) + " ");
            }
            System.out.println();
        }
    }

}
