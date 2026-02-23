import java.util.Scanner;

public class Var10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > 0)
            f = x * x * Math.sin(x) + Math.sqrt(x * x + 1.2);
        else if (x > 2 && x <= 6)
            f = Math.pow(Math.tan(x), 2) + Math.cos(x) + 3.5;
        else {
            System.out.println("Берілген аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}
