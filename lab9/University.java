class University {

    class Student {
        String name;
        String major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void display() {
            System.out.println(name + " studies " + major);
        }
    }

    public static void main(String[] args) {
        University u = new University();
        University.Student s = u.new Student("Karakoz", "IT");
        s.display();
    }
}

