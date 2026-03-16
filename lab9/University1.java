class University1 {

    static int studentCount = 0;

    class Student {

        Student() {
            studentCount++;
        }
    }

    public static void main(String[] args) {
        University1 u = new University1();

        University1.Student s1 = u.new Student();
        University1.Student s2 = u.new Student();
        University1.Student s3 = u.new Student();

        System.out.println("Total students: " + studentCount);
    }
}