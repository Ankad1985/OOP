package org.example;

public class Main {
    public static void main(String[] args) {
        Class class9A = new Class();
        Student student1 = new Student("Valentin","Ivanov","9A",12);
        Student student2 = new Student("Petr","Petrov","9A",14);
        Student student3 = new Student("Novikova","Elena","9A",9);
        class9A.addStudents(student1);
        class9A.addStudents(student2);
        class9A.addStudents(student3);
        for (Student item: class9A) {
            System.out.println(item);

        }

        System.out.println("Hello world!");
    }
}