import java.util.*;
public class task14 {
    public static void main(String[] args) {
class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name + " " + age + " " + grade;
    }
}


        List<Student> list = Arrays.asList(
                new Student("Ali", 20, 85),
                new Student("Dana", 22, 75),
                new Student("Arman", 21, 90)
        );

        list.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}
