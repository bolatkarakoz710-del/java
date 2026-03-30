import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
    // Тапсырма 6: Есептеу тарихын сақтау (ArrayList қолдану)
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Тапсырма 5: Операцияларды сандар арқылы таңдайтын меню
                System.out.println("\n--- Калькулятор Менюі ---");
                System.out.println("1 - Қосу (+)");
                System.out.println("2 - Азайту (-)");
                System.out.println("3 - Көбейту (*)");
                System.out.println("4 - Бөлу (/)");
                System.out.println("5 - Дәрежеге шығару (x^y)");    // Тапсырма 1
                System.out.println("6 - Квадрат түбір (√)");       // Тапсырма 2
                System.out.println("7 - Процент есептеу (a-ның b %-ы)"); // Тапсырма 8
                System.out.println("8 - Инженерлік (sin, cos, tan)"); // Тапсырма 9
                System.out.println("9 - Өрнекті есептеу (2+3*4)");   // Тапсырма 10
                System.out.println("10 - Тарихты көру");            // Тапсырма 6 жалғасы
                System.out.println("11 - Экранды тазалау");         // Тапсырма 7
                System.out.println("0 - Шығу");
                System.out.print("Таңдау: ");

                // Тапсырма 4: Мәліметтердің дұрыстығын тексеру (InputMismatchException)
                int choice = scanner.nextInt();

                if (choice == 0) break;

                // Тапсырма 7: Экранды тазалау функциясы (имитация)
                if (choice == 11) {
                    for (int i = 0; i < 30; i++) System.out.println();
                    continue;
                }

                // Тапсырма 10: Қарапайым арифметикалық өрнектер (Parsing имитациясы)
                if (choice == 9) {
                    System.out.print("Өрнекті жазыңыз (мысалы 2+3): ");
                    scanner.nextLine();
                    String expr = scanner.nextLine();
                    System.out.println("Өрнек нәтижесі (имитация): " + expr);
                    history.add("Өрнек: " + expr);
                    continue;
                }

                if (choice == 10) {
                    System.out.println("Есептеулер тарихы: " + history);
                    continue;
                }

                double num1 = 0, num2 = 0, result = 0;
                String opLog = "";

                // Тапсырма 3: Теріс сандармен жұмыс (double барлық санды қабылдайды)
                if (choice >= 1 && choice <= 5 || choice == 7) {
                    System.out.print("Бірінші санды енгізіңіз: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Екінші санды енгізіңіз: ");
                    num2 = scanner.nextDouble();
                } else if (choice == 6 || choice == 8) {
                    System.out.print("Санды енгізіңіз: ");
                    num1 = scanner.nextDouble();
                }

                switch (choice) {
                    case 1: result = num1 + num2; opLog = num1 + " + " + num2 + " = " + result; break;
                    case 2: result = num1 - num2; opLog = num1 + " - " + num2 + " = " + result; break;
                    case 3: result = num1 * num2; opLog = num1 + " * " + num2 + " = " + result; break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            opLog = num1 + " / " + num2 + " = " + result;
                        } else {
                            System.out.println("Қате: Нөлге бөлуге болмайды.");
                            continue;
                        }
                        break;
                    case 5: // Тапсырма 1: Дәреже (x^y)
                        result = Math.pow(num1, num2);
                        opLog = num1 + " ^ " + num2 + " = " + result;
                        break;
                    case 6: // Тапсырма 2: Квадрат түбір
                        result = Math.sqrt(num1);
                        opLog = "√" + num1 + " = " + result;
                        break;
                    case 7: // Тапсырма 8: Процент
                        result = (num1 * num2) / 100;
                        opLog = num1 + "-дің " + num2 + "%-ы = " + result;
                        break;
                    case 8: // Тапсырма 9: Инженерлік калькулятор
                        System.out.println("1-sin, 2-cos, 3-tan");
                        int eng = scanner.nextInt();
                        if(eng==1) result = Math.sin(Math.toRadians(num1));
                        else if(eng==2) result = Math.cos(Math.toRadians(num1));
                        else result = Math.tan(Math.toRadians(num1));
                        opLog = "Инженерлік есеп: " + result;
                        break;
                    default:
                        System.out.println("Қате таңдау.");
                        continue;
                }

                System.out.println("Нәтиже: " + result);
                history.add(opLog); // Тарихты жаңарту

            } catch (InputMismatchException e) {
                System.out.println("Қате: Тек сандарды енгізіңіз!");
                scanner.nextLine(); // Қате енгізуді тазалау
            }
        }
        scanner.close();
    }
}