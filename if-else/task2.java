import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Санды енгізіңіз: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Сан 3-ке де, 5-ке де бөлінеді");
        } else {
            System.out.println("Сан 3-ке және 5-ке бірдей бөлінбейді");
        }
    }
}