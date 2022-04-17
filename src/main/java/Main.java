import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var algorithms = new MultiplicationAlgorithm[] {
                // todo
        };

        for (var algorithm : algorithms) {
            for (int i = 10; i < 10000; i += 100) {
                var matrix1 = generateRandomMatrix(i, i);
                var matrix2 = generateRandomMatrix(i, i);
                // start metering time
                // multiply
                // stop metering time
            }
        }


    }

    private static Matrix generateRandomMatrix(int numOfRows, int numOfColumns) {
        var matrix = new int[numOfRows][numOfColumns];
        var random = new Random();
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                matrix[i][j] = random.nextInt();
            }
        }
        return new Matrix(matrix);
    }

}
