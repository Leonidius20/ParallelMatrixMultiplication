/**
 * Single-threaded algorithm that multiplies the matrices just like we would do it by hand
 */
public class SimpleMultiplication implements MultiplicationAlgorithm {

    @Override
    public int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == 0) return null;
        if (matrix1[0].length != matrix2.length) return null;

        var result = new int[matrix1.length][matrix2[0].length];

        for (int matrix1row = 0; matrix1row < matrix1.length; matrix1row++) {
            for (int matrix2column = 0; matrix2column < matrix2[0].length; matrix2column++) {
                int sum = 0;

                for (int item = 0; item < matrix1[0].length; item++) {
                    sum += matrix1[matrix1row][item] * matrix2[item][matrix2column];
                }

                result[matrix1row][matrix2column] = sum;
            }
        }

        return result;
    }

    @Override
    public String getName() {
        return "Simple";
    }

}
