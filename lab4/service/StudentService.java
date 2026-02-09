package service;

import model.Student;

public class StudentService {

    public void printStudent(Student student) {
        System.out.println("StudentService арқылы шығару:");
        student.showInfo();
    }
}