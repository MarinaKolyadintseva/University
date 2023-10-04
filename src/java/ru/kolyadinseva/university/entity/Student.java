package ru.kolyadinseva.university.entity;

public class Student implements Lesson {

    @Override
    public void go() {
        tell();
        System.out.println("Я студент и я хожу");
    }

    private void tell() {

        System.out.println("Я студент и я рассказываю.");
    }
}
