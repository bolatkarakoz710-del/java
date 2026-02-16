import java.util.Scanner;
public class while2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("N санын енгізіңіз: ");
        int n = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println(n + "! = " + factorial);
    }
}