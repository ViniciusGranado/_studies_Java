package model.entities;

import java.util.Objects;

public class Student implements Comparable<Student>{
  private Integer number;

  public Student() {}

  public Student(Integer number) {
    this.number = number;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  @Override
  public int compareTo(Student o) {
    return number.compareTo(o.number);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return Objects.equals(number, student.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }
}
