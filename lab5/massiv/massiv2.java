package massiv;

import java.util.Scanner;

public class massiv2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Массив ұзындығын енгізіңіз: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Массивті енгізу
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        // Жұп элементтерді санау
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Массивтегі жұп элементтердің саны: " + evenCount);
    }
}
