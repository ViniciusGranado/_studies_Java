package exercise02;

public class Teacher {
  private String name;
  private String department;
  private String email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void getinfo () {
    System.out.println("\n---------------------------");
    System.out.println("     DADOS DO PROFESSOR    ");
    System.out.println("---------------------------\n");

    System.out.println("Nome do curso: " + getName());
    System.out.println("Departamento: " + getDepartment());
    System.out.println("E-mail: " + getEmail());
  }
}
