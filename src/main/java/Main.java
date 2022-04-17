import java.util.Random;

public class Main {

    public static void main(String[] args) {

        var algo = new SimpleMultiplication();
        var matrix1 = new int[][] {
                { 1, 1, 1 },
                { 1, 2, 3 },
        };
        var matrix2 = new int[][] {
                { 1, 1, 1 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };

        var result = algo.multiply(matrix1, matrix2);


        var algorithms = new MultiplicationAlgorithm[] {
                // todo
        };

        for (var algorithm : algorithms) {
            for (int i = 10; i < 10000; i += 100) {
               // var matrix1 = generateRandomMatrix(i, i);
              //  var matrix2 = generateRandomMatrix(i, i);
                // start metering time
                // multiply
                // stop metering time
            }
        }


    }

    private static int[][] generateRandomMatrix(int numOfRows, int numOfColumns) {
        var matrix = new int[numOfRows][numOfColumns];
        var random = new Random();
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                matrix[i][j] = random.nextInt();
            }
        }
        return matrix;
    }

}
