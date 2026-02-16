
    import java.util.Scanner;
    public class F1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("x мәнін енгізіңіз: ");
            double x = sc.nextDouble();

            double f;

            if (x < 0) {
                f = x * x;
            } else if (x >= 0 && x < 5) {
                f = 2 * x + 1;
            } else {
                f = 10;
            }

            System.out.println("f(x) = " + f);
        }
    }

