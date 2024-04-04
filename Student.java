import java.util.Scanner;

// Define a class for representing a student
class Student {
    // Properties of a student
    String name;
    int age;
    String birthday;
    String address;
    String studentNumber;
    String year;
    String section;
    String arrivalTime;
    String dismissalTime;

    // Constructor to initialize student properties
    public Student(String name, int age, String birthday, String address, String studentNumber, String year, String section, String arrivalTime, String dismissalTime) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.studentNumber = studentNumber;
        this.year = year;
        this.section = section;
        this.arrivalTime = arrivalTime;
        this.dismissalTime = dismissalTime;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
        System.out.println("Address: " + address);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Year: " + year);
        System.out.println("Section: " + section);
        System.out.println("Time of Arrival: " + arrivalTime);
        System.out.println("Time of Dismissal: " + dismissalTime);
    }
}