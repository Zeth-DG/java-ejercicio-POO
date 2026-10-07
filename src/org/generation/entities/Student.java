package org.generation.entities;

public class Student {
    String firstName;
    String lastName;
    int registration; //año de registro
    public int grade; // calificacion 0-100
    int year; // 1-6

    public Student(String firstName, String lastName, int registration, int grade, int year) {
            this.firstName = firstName.toUpperCase();
            this.lastName = lastName.toUpperCase();
            this.registration = registration;
            this.grade = grade;
            this.year = year;
        }// constructor 1 Student

    public Student(String firstName, String lastName, int registration, int grade) {
            this(firstName, lastName, registration, grade, 1);
        }// constructor 2 Student

    public Student(String firstName, String lastName) {
            this(firstName, lastName, 2026, 0, 1);
        }// constructor 3 Student

    public String printFullName(){
        String fullName = firstName + " " + lastName;
        //System.out.println("Student full name: " + firstName + " " + lastName);
        return fullName;
    }//method printFullName

    public boolean isApproved(){
        if (this.grade < 60 || this.grade > 100){
            return false;
        } else {
            return true;
        }//else
    }//method is approved

    public int changeYearIfApproved(){
        if (isApproved()){
            this.year += 1;
            System.out.println("Student advance to year: " + this.year);
        } else {
            System.out.println("Student needs to recurse year: " + this.year);
        }//else
        return this.year;
    }//method changeYear

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", year=" + year +
                '}';
    }//toString
}//class