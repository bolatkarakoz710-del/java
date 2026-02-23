import java.util.Scanner;

        public class Var8 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("x мәнін енгізіңіз: ");
                double x = sc.nextDouble();
                double f;

                if (x > -5 && x < 0)
                    f = Math.sqrt(x * x) + Math.abs(x);
                else if (x >= 0 && x < 2)
                    f = 5 * Math.pow(x, 3) + Math.cos(x);
                else {
                    System.out.println("Берілген аралыққа кірмейді");
                    return;
                }

                System.out.println("f(x) = " + f);
            }
        }
