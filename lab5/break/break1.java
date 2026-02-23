public class break1 {
    public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i); // санды шығару
                if (i % 13 == 0) {     // 13-ке бөлінсе
                    System.out.println("13-ке бөлінетін сан табылды: " + i);
                    break;             // циклді тоқтату
                }
            }
        }
    }

