public class MatrixPrint {
    public static void main(String[] args) {
        int size = 11;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = i * size + j + 1;
                if ((i == j) || (i + j == size - 1)) {
                    System.out.printf("%3s", "*");
                    System.out.print(" ");
                } else {
                    System.out.printf("%3d", matrix[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
