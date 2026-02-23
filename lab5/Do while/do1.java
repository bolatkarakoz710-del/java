import java.util.Scanner;
public class do1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Парольді енгізіңіз: ");
            password = scanner.nextLine();
        } while (!password.equals("2007"));

        System.out.println("Қош келдіңіз!");
    }
}
