public class Massiv10 {
    public static void main(String[] args) {
        double[][] D = new double[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = Math.random() * 20;
            }
            sum += D[i][i];
        }
        System.out.println("10) Диагональ орта мән = " + sum / 7);
    }
    }