
import java.util.function.Function;

public class turlenduru {
    public static void main(String[] args) {
        Function<String, String> upper = s -> s.toUpperCase();
        System.out.println(upper.apply("hello"));
    }
}