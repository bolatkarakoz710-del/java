public class Massiv8 {

    public static void main(String[] args) {
        double[][] X = new double[12][6];

        System.out.println("8) Бағана бойынша теріс көбейтінді:");
        for (int j = 0; j < 6; j++) {
            double mult = 1;
            for (int i = 0; i < 12; i++) {
                X[i][j] = Math.random() * 20 - 10;
                if (X[i][j] < 0)
                    mult *= X[i][j];
            }
            System.out.println("Column " + j + " = " + mult);
        }
    }
}