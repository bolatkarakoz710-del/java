import java.util.Scanner;

public class Var5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x < 2)
            f = Math.pow(x, 3) * Math.cos(x);
        else if (x >= 2)
            f = 3 * Math.pow(x, 4) + 7;
        else if (x > 5 && x <= 9)
            f = Math.sqrt(5 * x * x + 1.6);
        else {
            System.out.println("Берілген аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}