package Exercise03;

public class Fish extends Animal {
  private String characteristics;

  public Fish() {
    super.setNumberOfPaws(4);
    super.setEnvironment("Mar");
    super.setColor("grey");
    this.characteristics = "Barbatanas e Cauda";
  }

  public Fish(String name, double length, int numberOfPaws, String color,
              String environment, double speed, String characteristics) {
    super(name, length, numberOfPaws, color, environment, speed);
    this.characteristics = characteristics;
  }

  public void printInfo() {
    System.out.println("Animal: " + super.getName());
    System.out.println("Comprimento: " + super.getLength() + " cm");
    System.out.println("Patas: " + super.getNumberOfPaws());
    System.out.println("Cor: " + super.getColor());
    System.out.println("Ambiente: " + super.getEnvironment());
    System.out.println("Velocidade: " + super.getSpeed() + " m/s");
    System.out.println("Característica: " + characteristics);
  }
}
