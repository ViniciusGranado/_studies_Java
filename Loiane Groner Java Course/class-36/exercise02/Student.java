package exercise02;

public class Student {
  private String name;
  private int id;
  private int[] grades;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int[] getGrades() {
    return grades;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  public void getInfo (int studentNumber) {
    System.out.println("Aluno " + (studentNumber) + ": " + getName());

    for (int j = 0; j < getGrades().length; j++) {
      System.out.println("Nota " + (j + 1) + ": " + getGrades()[j]);
    }

    System.out.println("---------------------------");
  }
}
