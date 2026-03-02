public class Massiv7 {
    public static void main(String[] args) {
        double[][] M = new double[5][5];
        double[] R = new double[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                M[i][j] = Math.random() * 20 - 10;
                if (M[i][j] > 0)
                    R[i] += M[i][j];
            }
        }
    }
}