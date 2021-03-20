//package Exercise03;

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
}
