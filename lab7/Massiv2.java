public class Massiv2 {

    public static void main(String[] args) {
        double[] A2 = new double[12];
        double multNeg = 1;

        for (int i = 0; i < 12; i++) {
            A2[i] = Math.random() * 20 - 10;
            if (A2[i] < 0)
                multNeg *= A2[i];
        }
        System.out.println("3) Теріс көбейтінді = " + multNeg);
    }
}