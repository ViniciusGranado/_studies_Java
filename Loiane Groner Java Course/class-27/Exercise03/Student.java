package Exercise03;

public class Student {
  String name;
  String registrationNumber;
  String course;
  String[] subjects = new String[3];
  Double[][] grades = new Double[subjects.length][4];

  double getMean (int index) {
    double sum = 0;
    double mean;
    for (int i = 0; i < grades[index].length; i++) {
      sum += grades[index][i];
    }

    mean = sum / grades[index].length;
    return mean;
  }

  String getSituation (double mean) {
    if (mean <= 7) {
      return "Reprovado";
    }
    
    return "Aprovado";
  }

  void showInfo () {
    System.out.println("\n-------------------------------");
    System.out.println("        DADOS DO ALUNO         ");
    System.out.println("-------------------------------\n");

    System.out.println("Nome: " + name);
    System.out.println("Número de matrícula: " + registrationNumber);
    System.out.println("Curso: " + course);

    System.out.println("---------------------------------");

    double mean;
    String situation;

    for (int i = 0; i < grades.length; i++) {
      System.out.println("Disciplina: " + (subjects[i]));

      mean = getMean(i);
      situation = getSituation(mean);
      System.out.println("Média: " + getMean(i));
      System.out.println("Situação: " + situation);
      System.out.println("---------------------------------");
    }
  }
}
