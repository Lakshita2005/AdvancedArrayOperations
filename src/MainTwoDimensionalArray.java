import java.util.Arrays;

public class MainTwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray array = new TwoDimensionalArray(2, 2);
        
        // Test insertRow and insertColumn
        array.insertRow(0, new int[]{1, 2});
        array.insertColumn(1, new int[]{3, 4});
        array.deleteRow(0);

        // Expected output: [[3, 4]]
        System.out.println("After insertRow, insertColumn, and deleteRow:");
        System.out.println(Arrays.deepToString(array.traverse()));

        // Test transposeMatrix
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] transposed = TwoDimensionalArray.transposeMatrix(matrix);

        // Expected output: [[1, 3], [2, 4]]
        System.out.println("Transpose of matrix [[1, 2], [3, 4]]:");
        System.out.println(Arrays.deepToString(transposed));
    }
}
