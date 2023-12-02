public class _3_NTriangle {

//            1
//            1 2
//            1 2 3
//            1 2 3 4

    public static void main(String[] args) {
        nTriangle(4);
    }

    public static void nTriangle(int n) {
        // Write your code here
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}

