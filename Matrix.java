public class Matrix {
    private int[][] matrix;
    private int size;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
        System.out.println("The Matrix is: " + size + " by " + size);
    }

    private void fix(int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    public void fillMatrix() {
        int value = 1;
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                matrix[x][y] = value++;
            }
        }
    }

    public void printMatrix() {
        for (int x = 0; x < size; x++) {
            for (int y = 0; 0 < size; y++) {
                if (x + y == size - 1) {
                    System.out.print("\u001B[1;94m\u001B[4m" + matrix[x][y] + "\u001B[0m\t");
                } else {
                    System.out.print(matrix[x][y] + "\t");
                }
            }
            System.out.print("\n");
        }
    }

    public void flip() {
        for (int x = 0; x < size / 2; x++) {
            for (int y = 0; y < size; y++) {
                if (x + y != size - 1) {
                    fix(x, y, size - 1 - x, size - 1 - y);
                }
            }
        }
    }
}
