public class Matrix {

    private static MultiplicationAlgorithm algorithm = null;

    public static void setMultiplicationAlgorithm(MultiplicationAlgorithm algorithm1) {
        algorithm = algorithm1;
    }

    private final int[][] matrix;

    public Matrix(int numOfRows, int numOfColumns) {
        matrix = new int[numOfRows][numOfColumns];
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getNumOfRows() {return matrix.length; }

    public int getNumOfColumns() {return matrix[0].length; }

    public Matrix multiplyBy(Matrix other, MultiplicationAlgorithm algorithm) {
        if (algorithm == null) throw new RuntimeException("Multiplication algorithm not set");
        return algorithm.multiply(this, other);
    }

}
