class MathUtils {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        System.out.println("Square: " + square(5));
        System.out.println("Cube: " + cube(5));
    }
}