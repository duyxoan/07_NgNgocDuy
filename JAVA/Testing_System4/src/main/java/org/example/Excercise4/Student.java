package org.example.Excercise4;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double grade;

    public Student(int id, String name, String hometown ) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;
        this.grade = 0.0;
    }



    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void addGrade(double additionalGrade) {
        this.grade += additionalGrade;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Hometown: " + hometown);
        System.out.print("Grade: " + grade);

        if (grade < 4.0) {
            System.out.println(" (Yếu)");
        } else if (grade < 6.0) {
            System.out.println(" (Trung bình)");
        } else if (grade < 8.0) {
            System.out.println(" (Khá)");
        } else {
            System.out.println(" (Giỏi)");
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1,"Duy", "New York");
        student.printInfo();

        student.setGrade(5.5);
        student.addGrade(2.0);
        student.printInfo();
    }
}
