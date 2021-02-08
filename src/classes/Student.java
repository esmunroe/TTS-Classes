package classes;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String gradeLevel;
    private ArrayList<String> classes;

    public Student() {}

    public Student(String name, int age, String gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    public Student(String name, int age, String gradeLevel, ArrayList<String> classes) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
        this.classes = classes;
    }
}
