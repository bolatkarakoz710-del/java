package main;

import model.Student;
import service.StudentService;

public class main {
    public static void main(String[] args) {

        // 8. Объектілердің құрылуы
        Student s1 = new Student("Қаракөз", 18, "Дизайнер");
        Student s2 = new Student("Айгерім", 19, "Флорист");
        Student s3 = new Student(); // әдепкі конструктор

        // 4. Бір-бірінен тәуелсіз объектілер
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        // 5. Әдіс арқылы объектіні өзгерту
        s3.changeMajor("Математика");
        s3.showInfo();

        // 7. Класстардың өзара әрекеті
        StudentService service = new StudentService();
        service.printStudent(s1);

        // 8. Бағдарлама аяқталған соң объектілер жойылады (Garbage Collector)
    }
}