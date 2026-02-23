import java.util.Scanner;

public class Var3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > -4 && x <= 5)
            f = Math.cbrt(x * x + 3 + 6 * x * x);
        else if (x > 0)
            f = Math.pow(x, 5) + 3.5;
        else {
            System.out.println("Берілген аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}
