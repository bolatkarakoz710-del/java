package massiv;

import java.util.Scanner;

public class massiv1 {
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

        // Ең үлкен элементті табу
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Массивтегі ең үлкен элемент: " + max);
    }
}