package com.mycompany.java1.fa25.ass1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public boolean updateStudent(int id, String newName, int newAge) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setAge(newAge);
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }
}
