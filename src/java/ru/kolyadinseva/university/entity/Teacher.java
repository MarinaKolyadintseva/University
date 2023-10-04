package ru.kolyadinseva.university.entity;

public class Teacher implements Lesson {

    @Override
    public void go() {
        teacheng();
        System.out.println("Я преподаватель и я хожу");
    }

    private void teacheng() {
        System.out.println("Я преподаватель и я преподаю.");
    }
}
