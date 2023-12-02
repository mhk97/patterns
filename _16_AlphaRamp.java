public class _16_AlphaRamp {

    //    A
    //    B B
    //    C C C
    //    D D D D
    //    E E E E E
    public static void main(String[] args) {
        alphaRamp(5);
    }

    public static void alphaRamp(int n) {
        // Write your code here
        int ch = 'A';
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print((char) ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
