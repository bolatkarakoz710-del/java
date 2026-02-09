package model;

public class Student {

    // 1. Өрістер
    private String name;
    private int age;
    private String major;

    // 2. Әдепкі конструктор
    public Student() {
        this.name = "Белгісіз";
        this.age = 0;
        this.major = "Таңдалмаған";
    }

    // 2,3. Параметрлі конструктор + this кілт сөзі
    public Student(String name, int age, String major) {
        this.name = name;     // this — класс өрісі
        this.age = age;
        this.major = major;
    }

    // 5. Ақпарат шығаратын әдіс
    public void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("--------------------");
    }

    // 5. Объектінің күйін өзгертетін әдіс
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }
}

