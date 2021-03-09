package exercise02;

public class Curso {
  private String name;
  private String time;
  private Teacher teacher;
  private Student[] students;

  Curso () {
    this.students = new Student[5];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public Student[] getStudents () {
    return students;
  }

  public void setStudents (Student[] students) {
    this.students = students;
  }

  public void getInfo () {
    System.out.println("---------------------------");
    System.out.println("       DADOS DO CURSO      ");
    System.out.println("---------------------------\n");

    System.out.println("Nome do curso: " + name);
    System.out.println("Horário: " + time);
  }

  public void getStudentsInfo () {
    System.out.println("\n---------------------------");
    System.out.println("      DADOS DOS ALUNOS     ");
    System.out.println("---------------------------\n");

    for (int i = 0; i < getStudents().length; i++) {
      Student estudante = new Student();
      
      estudante = getStudents()[i];

      System.out.println("Aluno " + (i + 1) + ": " + estudante.getName());

      for (int j = 0; j < estudante.getGrades().length; j++) {
        System.out.println("Nota " + (j + 1) + ": " + estudante.getGrades()[j]);
      }

      System.out.println("---------------------------");
    }
  }
      
  public void getCourseInfo () {
    this.getInfo();
    teacher.getinfo();
    getStudentsInfo();
  }
}
