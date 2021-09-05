public class Main {
  public static void main (String[] args) {
    try {
      Horario horario = new Horario((byte) 22, (byte) 6,(byte) 4);

      // test toString
      System.out.println(horario.toString());
 
      // test getters
      System.out.println(horario.getHora());
      System.out.println(horario.getMinuto());
      System.out.println(horario.getSegundo());

      // test setters
      horario.setHora((byte) 12);
      horario.setMinuto((byte) 4);
      horario.setSegundo((byte) 47);

      System.out.println(horario.toString());

      // test equals
      Horario horario02 =  new Horario((byte) 12, (byte) 4,(byte) 47);
      System.out.println(horario.equals(horario02));

      // test hashCode
      System.out.println(horario.hashCode());

      // test clones
      Horario clone1 = new Horario(horario);
      Horario clone2 = (Horario) horario.clone();

      System.out.println(horario);
      System.out.println(clone1);
      System.out.println(clone2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}