package exercise03.Student;

public class Student {
  private String name;
  private String registrationNumber;
  private String course;
  private String[] subjects;
  private Double[][] grades;

  // Constructor
  public Student () {
    this.subjects = new String[3]; 
    this.grades = new Double[subjects.length][4];
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public String[] getSubjects() {
    return subjects;
  }

  public void setSubjects(String[] subjects) {
    this.subjects = subjects;
  }

  public Double[][] getGrades() {
    return grades;
  }

  public void setGrades(Double[][] grades) {
    this.grades = grades;
  }

  // Methods
  private double getMean (int index) {
    double sum = 0;
    double mean;
    for (int i = 0; i < this.grades[index].length; i++) {
      sum += this.grades[index][i];
    }

    mean = sum / this.grades[index].length;
    return mean;
  }

  private String getSituation (double mean) {
    if (mean <= 7) {
      return "Reprovado";
    }
    
    return "Aprovado";
  }

  public void showInfo () {
    System.out.println("\n-------------------------------");
    System.out.println("        DADOS DO ALUNO         ");
    System.out.println("-------------------------------\n");

    System.out.println("Nome: " + this.name);
    System.out.println("Número de matrícula: " + this.registrationNumber);
    System.out.println("Curso: " + this.course);

    System.out.println("---------------------------------");

    double mean;
    String situation;

    for (int i = 0; i < this.grades.length; i++) {
      System.out.println("Disciplina: " + (this.subjects[i]));

      mean = getMean(i);
      situation = getSituation(mean);
      System.out.println("Média: " + mean);
      System.out.println("Situação: " + situation);
      System.out.println("---------------------------------");
    }
  }
}
