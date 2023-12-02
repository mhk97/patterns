public class _17_AlphaHill {

//          A
//        A B A
//       A B C B A
//      A B C D C B A
//     A B C D E D C B A

    public static void main(String[] args) {
        alphaHill(5);
    }

    public static void alphaHill(int n) {
        // Write your code here


        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= n - r; c++) {
                System.out.print(" ");
            }

            int ch = 'A';
            for (int c = 1; c <= (2 * r) - 1; c++) {
                System.out.print((char) ch + " ");
                if (c < r) ch++;
                else ch--;
            }

            System.out.println();
        }

    }

}
