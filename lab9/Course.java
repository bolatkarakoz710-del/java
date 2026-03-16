class Course {

    class Student {
        String studentName;
        String courseName;

        Student(String studentName, String courseName) {
            this.studentName = studentName;
            this.courseName = courseName;
        }

        void show() {
            System.out.println(studentName + " enrolled in " + courseName);
        }
    }

    public static void main(String[] args) {
        Course c = new Course();
        Course.Student s = c.new Student("Karakoz", "Java Course");
        s.show();
    }
}
