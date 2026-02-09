//public class lab3
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {

        // Создание объекта Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Ввод длины прямоугольника
        System.out.print("x тың мәні: ");

        System.out.print("Есепті таңдаңыз (1-23): ");
         int n =scanner.nextInt();
          switch (n){


        case 1: {
            double x = scanner.nextDouble();
            double f1 = Math.cbrt(Math.exp(2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3.0))) + 1.7;
            break;
        }
              case 2: {
                  double x = scanner.nextDouble();
         double f1=Math.log(Math.abs(x - 1.5)) + Math.pow(Math.abs(x), 4.0/5.0) + Math.cbrt(Math.exp(3*x) + 4);
                  break;
              }

              case 3: {
                  double x = scanner.nextDouble();
              double f1=Math.tan((5.0/3.0)*x)+ Math.log(Math.abs(2*x + 5))+ 1.8;
                  break;
              }
              case 4: {
                  double x = scanner.nextDouble();
       double f1=Math.cos(5+x)+ Math.pow(Math.PI + Math.abs(2-x),7.0);
                  break;
              }

              case 5: {
                  double x = scanner.nextDouble();
       double f1=Math.pow(x,5)+ Math.log(Math.sqrt(Math.PI + Math.abs(5 - x)));
                  break;
              }
              case 6: {
                  double x = scanner.nextDouble();
        int xi = (int)x;
        double f1=Math.pow(x,7) + xi / 2+ xi % 5+ Math.exp(5*x);
                  break;
              }

              case 7: {
                  double x = scanner.nextDouble();
       int xi = (int)x;
       double f1=xi % 6+ Math.pow(x,3) * Math.log(x*x);
              break;
          }

              case 8: {
                  double x = scanner.nextDouble();
                  double f1=Math.pow(x*7, 5)+ Math.sin(Math.pow(x,4))+ Math.tan(Math.pow(x,3));
                  break;
              }
                  case 9: {
                      double x = scanner.nextDouble();
                      double f1= Math.pow(Math.exp(3*x) + 7, 4)+ Math.cos(Math.pow(x,5))+ Math.log(Math.abs(3*x + 7));
                      break;
                  }
                      case 10: {
                          double x = scanner.nextDouble();
       double f1= Math.log(5*x)+ Math.pow(x,5) * Math.sin(Math.pow(x,3))+ Math.tan(Math.pow(x,4));
                          break;
                      }
        //11
        //12
        //Қосымша есептер
                          case 13: {
                              double x = scanner.nextDouble();
     double f1 = Math.log(5 * x) + Math.pow(x, 5) * Math.tan(Math.pow(x, 3)) + Math.sin(Math.pow(x, 4));
                              break;
                          }

                              case 14: {
                                  double x = scanner.nextDouble();
        double f1 = Math.pow(x + 2, 3)+ Math.sin(Math.pow(x, 2)) + Math.log(Math.abs(2*x + 1));
                                  break;
                              }

                                  case 15: {
                                      double x = scanner.nextDouble();
        double f1 = Math.exp(x)+ Math.cos(Math.pow(x, 3))- Math.sqrt(Math.abs(x - 4));
                                      break;
                                  }

                                      case 16: {
                                          double x = scanner.nextDouble();//16
       double f1 = Math.pow(3*x, 2)+ Math.tan(x) + Math.log(Math.abs(x + 7));
                                          break;
                                      }
                                          case 17: {
                                              double x = scanner.nextDouble();
double f1 = Math.sin(x)+ Math.cos(Math.pow(x, 2)) + Math.exp(2*x);
                                              break;
                                          }

                                              case 18: {
                                                  double x = scanner.nextDouble();
double f1 = Math.pow(x + 3, 2)+ Math.sin(Math.pow(x, 2))+ Math.log(Math.abs(x + 1));
                                                  break;
                                              }

                                                  case 19: {
                                                      double x = scanner.nextDouble();
double f1 = Math.sin(x)+ Math.cos(Math.pow(x, 2))+ Math.exp(2*x)- Math.sqrt(Math.abs(x));
                                                      break;
                                                  }
                                                      case 20: {
                                                          double x = scanner.nextDouble();
double f1 = Math.pow(x, 4)+ Math.sin(Math.pow(x, 3))+ Math.log(Math.abs(x + 6))+ Math.cos(x);
                                                          break;
                                                      }
                                                          case 21: {
                                                              double x = scanner.nextDouble();
double f1 = Math.exp(2*x) + Math.sin(Math.pow(x, 3))- Math.sqrt(Math.abs(x + 5));
                                                              break;
                                                          }
                                                              case 22: {
                                                                  double x = scanner.nextDouble();
double f1 = Math.pow(5*x, 2)+ Math.tan(x)+ Math.cos(Math.pow(x, 2));
                                                                  break;
                                                              }
                                                                  case 23: {
                                                                      double x = scanner.nextDouble();
        double f1 = Math.sin(x)+ Math.exp(x)+ Math.log(Math.abs(x + 2))- Math.sqrt(Math.abs(3*x));
                                                                      break;
                                                                  }
                                                                      case 24: {
                                                                          double x = scanner.nextDouble();
double f1 = Math.pow(x, 3)+ Math.cos(Math.pow(x, 4)) + Math.sin(Math.pow(x, 2))+ Math.exp(x);
                                                                          break;
                                                                      }

        // Вывод результатов
        System.out.println("f=: " + f1);
    }
}
