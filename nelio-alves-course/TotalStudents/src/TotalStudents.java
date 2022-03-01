import model.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TotalStudents {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int studentsCourseA;
    int studentsCourseB;
    int studentsCourseC;

    Set<Student> students = new HashSet<>();

    System.out.print("How many students for course A? ");
    studentsCourseA = scanner.nextInt();
    addStudents(studentsCourseA, students);

    System.out.print("How many students for course B? ");
    studentsCourseB = scanner.nextInt();
    addStudents(studentsCourseB, students);


    System.out.print("How many students for course C? ");
    studentsCourseC = scanner.nextInt();
    addStudents(studentsCourseC, students);

    System.out.println("\nTotal students: " + students.size());
    for(Student student : students) {
      System.out.println(student.getNumber());
    }
  }

  public static void addStudents(int numberStudents, Set<? super Student> students) {
    for (int i = 0; i < numberStudents; i++) {
      System.out.printf("Enter student %d number: ", i + 1);
      students.add(new Student(scanner.nextInt()));
    }
  }
}
