public class break2 {
        public static void main(String[] args) {
            for (int i = 1; i <= 200; i++) {
                if (i % 7 == 0 && i % 9 == 0) { // 7-ге де, 9-ға да бөлінетін сан
                    System.out.println("7-ге және 9-ға бөлінетін бірінші сан: " + i);
                    break; // табылған соң циклді тоқтату
                }
            }
        }
    }

