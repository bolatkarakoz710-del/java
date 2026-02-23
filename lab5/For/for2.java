package For;

import java.util.Scanner;
public class for2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N санын енгізіңіз: ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("1-ден " + N + "-ге дейінгі сандардың қосындысы: " + sum);
    }
}
