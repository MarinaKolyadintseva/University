package ru.kolyadinseva.university._main;

import ru.kolyadinseva.university.entity.Student;
import ru.kolyadinseva.university.entity.Teacher;
import ru.kolyadinseva.university.util.Perfomer;

public class _Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student();

        Perfomer perfomer = new Perfomer();

        perfomer.makeGo(teacher);
        perfomer.makeGo(student);

    }
}