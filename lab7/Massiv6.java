public class Massiv6 {

    public static void main(String[] args) {

        // ===== 6. A[10][10] → B[10] (теріс қосынды) =====
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = (int) (Math.random() * 20 - 10);
                if (A[i][j] < 0)
                    B[i] += A[i][j];
            }
        }

        System.out.println("6) Қатар бойынша теріс қосынды:");
        for (int i = 0; i < 10; i++)
            System.out.println("Row " + i + " = " + B[i]);

    }
}