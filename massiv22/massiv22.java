public class massiv22 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0]; // әр жолдың бірінші элементін бастапқы максимум деп аламыз
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println((i+1) + "-жолдағы ең үлкен элемент: " + max);
        }
    }
}
