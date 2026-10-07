package org.generation;

import org.generation.entities.Courses;
import org.generation.entities.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ana", "García", 2021, 95, 5));
        students.add(new Student("Luis", "Martínez", 2022, 88, 4));
        students.add(new Student("Sofía", "Hernández", 2020, 76, 6));
        students.add(new Student("Carlos", "López", 2023, 91, 3));
        students.add(new Student("Mariana", "Pérez", 2021, 84, 5));
        students.add(new Student("Diego", "Ramírez", 2024, 69, 2));
        students.add(new Student("Valeria", "Torres", 2022, 98, 4));
        students.add(new Student("Jorge", "Flores", 2023, 73, 3));
        students.add(new Student("Fernanda", "Castillo", 2020, 87, 6));
        students.add(new Student("Miguel", "Morales", 2024, 79, 2));

        ArrayList<Courses> courses = new ArrayList<>();
        courses.add(new Courses("Programación en Java", "Laura Sánchez", 1));
        courses.add(new Courses("Bases de Datos", "Roberto Gómez", 2));
        courses.add(new Courses("Inteligencia Artificial", "Patricia Ramírez", 3));
        courses.add(new Courses("Desarrollo Web", "Fernando Díaz", 4));
        courses.add(new Courses("Análisis de Datos","Gabriela Torres",5));

        Student[] stu = students.toArray(new Student[0]);

        Courses courseJava = courses.get(0);
        courseJava.enroll(stu);

        double averageGrades = courseJava.calculateAverageGrade();
        System.out.println("=========Average grade on Java Course=========\n" + averageGrades);

        System.out.println("===============Student ranking===============");
        courseJava.printRanking();
        System.out.println("===Students with grades above group average===");
        courseJava.aboveAvergae();

        //System.out.println(students);
        //System.out.println(courses);


    }//main

}//class