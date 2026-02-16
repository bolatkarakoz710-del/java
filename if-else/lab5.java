//task-1
import java.util.Scanner;
public class lab5  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Бұл оң сан.");
        } else if (number < 0) {
            System.out.println("Бұл теріс сан.");
        } else {
            System.out.println("Сан нөлге тең.");
        }
    }
}


