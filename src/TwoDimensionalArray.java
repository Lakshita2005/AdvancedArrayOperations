public class TwoDimensionalArray {
    private int[][] matrix;
    private int rows;
    private int cols;

    public TwoDimensionalArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void insertRow(int rowIndex, int[] row) {
        if (rowIndex < 0 || rowIndex >= rows || row.length != cols) {
            throw new IllegalArgumentException("Invalid row index or row length.");
        }
        matrix[rowIndex] = row;
    }

    public void insertColumn(int colIndex, int[] col) {
        if (colIndex < 0 || colIndex >= cols || col.length != rows) {
            throw new IllegalArgumentException("Invalid column index or column length.");
        }
        for (int i = 0; i < rows; i++) {
            matrix[i][colIndex] = col[i];
        }
    }

    public void deleteRow(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= rows) {
            throw new IllegalArgumentException("Invalid row index.");
        }
        for (int i = 0; i < cols; i++) {
            matrix[rowIndex][i] = 0; // Set to 0 to mark as "deleted"
        }
    }

    public int[][] traverse() {
        return matrix;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
