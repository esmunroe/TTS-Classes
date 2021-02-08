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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    public Boolean hasClasses(){
        return classes.size() > 0;
    }

    @Override
    public String toString() {
        String studentInfo = "Name:\t" + name +
                "Age:\t" + age +
                "Grade Level:\t" + gradeLevel +
                "Classes:\n";
        for (int i = 0; i < classes.size(); i++) {
            studentInfo.concat(classes.get(i) + "\n");
        }
        return studentInfo;
    }
}
