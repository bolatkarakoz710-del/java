import java.util.Scanner;
public class switch2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Бірінші санды енгізіңіз: ");
        double a = scanner.nextDouble();

        System.out.print("Екінші санды енгізіңіз: ");
        double b = scanner.nextDouble();

        System.out.print("Амал таңбасын енгізіңіз (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Нәтиже: " + (a + b));
                break;

            case '-':
                System.out.println("Нәтиже: " + (a - b));
                break;

            case '*':
                System.out.println("Нәтиже: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Нәтиже: " + (a / b));
                } else {
                    System.out.println("Қате! 0-ге бөлуге болмайды.");
                }
                break;

            default:
                System.out.println("Қате амал таңдалды!");
        }
    }
}