package Exercise03;

public class Mammal extends Animal {
  private String food;

  public Mammal(String name, double length, int numberOfPaws, String color,
                String environment, double speed, String food) {
    super(name, length, numberOfPaws, color, environment, speed);
    this.food = food;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void printInfo() {
    System.out.println("Animal: " + super.getName());
    System.out.println("Comprimento: " + super.getLength() + " cm");
    System.out.println("Patas: " + super.getNumberOfPaws());
    System.out.println("Cor: " + super.getColor());
    System.out.println("Ambiente: " + super.getEnvironment());
    System.out.println("Velocidade: " + super.getSpeed() + " m/s");
    System.out.println("Alimento: " + food);
  }
}
