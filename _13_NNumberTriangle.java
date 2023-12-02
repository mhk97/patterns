public class _13_NNumberTriangle {

//            1
//            2 3
//            4 5 6
//            7 8 9 10

    public static void main(String[] args) {
        nNumberTriangle(4);
    }

    public static void nNumberTriangle(int n) {
        // Write your code here
        int count = 1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }
}
