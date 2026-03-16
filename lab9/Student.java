class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Karakoz", 18);
        Student s2 = new Student("Arsen", 19);
        Student s3 = new Student("Bekzat", 20);

        System.out.println("Total students: " + Student.count);
    }
}


