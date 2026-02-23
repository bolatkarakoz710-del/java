import java.util.Scanner;
public class do2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nМәзір:");
            System.out.println("1 – Хабарлама шығару");
            System.out.println("2 – Қосу");
            System.out.println("3 – Шығу");
            System.out.print("Таңдауыңызды енгізіңіз: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Сәлем! Бұл хабарлама.");
                    break;
                case 2:
                    System.out.print("a = ");
                    int a = scanner.nextInt();
                    System.out.print("b = ");
                    int b = scanner.nextInt();
                    System.out.println("Қосынды: " + (a + b));
                    break;
                case 3:
                    System.out.println("Бағдарлама аяқталды.");
                    break;
                default:
                    System.out.println("Қате таңдау!");
            }

        } while (choice != 3);
    }
}