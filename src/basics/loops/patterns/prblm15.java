package basics.loops.patterns;

public class prblm15 {
    public static void main(String[] args) {
        int n = 4; // middle number
        int totalCols = 2 * n - 1;

        for (int i = 1; i <= totalCols; i++) {
            int num = i <= n ? i : totalCols - i + 1;

            for (int j = 1; j <= totalCols; j++) {
                if (j == num || j == totalCols - num + 1) {
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
