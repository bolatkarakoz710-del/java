
    import java.util.Scanner;

    public class F2{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("x мәнін енгізіңіз: ");
            double x = sc.nextDouble();

            double f;

            if (x < 0) {
                f = Math.sin(x);
            } else if (x >= 0 && x < 2) {
                f = Math.cos(x);
            } else {
                f = Math.tan(x);
            }

            System.out.println("f(x) = " + f);
        }
    }

