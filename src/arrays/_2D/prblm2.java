package arrays._2D;

public class prblm2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowSum = new int[rows];

        for (int i = 0; i < rows; i++) {
            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }

            rowSum[i] = sum;
        }

        // Printing result
        for (int i = 0; i < rowSum.length; i++) {
            System.out.print(rowSum[i] + " ");
        }
    }
}
