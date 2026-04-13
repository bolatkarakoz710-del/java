import java.util.function.Supplier;

public class task12 {
    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}