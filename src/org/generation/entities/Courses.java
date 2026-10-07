package org.generation.entities;
import java.util.ArrayList;
import java.util.Comparator;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;

    public Courses(String courseName, String professorName, int year){
        this.courseName = (courseName.isBlank()) ? "GENERAL" : courseName;
        this.professorName = (professorName.isBlank()) ? "JANE DOE" : professorName;
        this.year = (year <= 0 || year > 6) ? 1: year;
        this.students = new ArrayList<>();
    }//constructor course

    public void enroll (Student student){
        this.students.add(student);
    }//method enroll one student

    public void enroll (Student[] students){
        for (Student student: students){
            this.enroll(student);
        }
    }//method enroll array

    public void unEnroll (Student student){
        Student tempStudent = student;
        for (Student std: students){
            if (tempStudent.equals(std)){
                tempStudent = std;
                break;
            }//if
        }//forEach
        this.students.remove(tempStudent);
    }//method unEnroll

    public int countStudents(){
       return this.students.size();
    }//method count

    public int bestGrade(){
        int max = 0;

        for (Student student: this.students){
            if (student.grade > max){
                max = student.grade;
            }//if
        }//each
        return max;
    }//method best grade

    public double calculateAverageGrade(){
        int sum = 0;
        double average_grade = 0;
        for (Student student: students) {
            sum += student.grade;
            average_grade = sum / students.size();
        }//foreach
        return average_grade;
    }//calculateAverage

    public void printRanking(){
        ArrayList<Student> sortedStudents = new ArrayList<>(students);

        Comparator<Student> gradesComparison = (s1, s2) -> {
            int comparation = Integer.compare(s2.grade, s1.grade);
            return comparation;
        }; //comparator

        sortedStudents.sort(gradesComparison);

        int rank = 1;
        for (Student student: sortedStudents){
            System.out.println(rank + " " + student.printFullName());
            rank += 1;
        }//forEach
    }//printRanking

    public void aboveAvergae(){
        double average = calculateAverageGrade();

        for (Student student: students){
            String fullName = student.printFullName();
            String status;

            status = (student.grade <= average) ? "upon average grades" : "above average grades";

            if (status == "above average grades"){
                System.out.println(fullName + " - " + status);
            }//if
        }//forEach
    }//aboutAverage

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", professorName='" + professorName + '\'' +
                ", year=" + year +
                ", students=" + students +
                '}';
    }
}//class course
