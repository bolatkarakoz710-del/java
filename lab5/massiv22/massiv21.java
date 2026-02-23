package massiv22;

public class massiv21 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {       // әр жол үшін
            for (int j = 0; j < matrix[i].length; j++) { // әр баған үшін
                sum += matrix[i][j];                     // қосу
            }
        }

        System.out.println("Матрицаның барлық элементтерінің қосындысы: " + sum);
    }
}
