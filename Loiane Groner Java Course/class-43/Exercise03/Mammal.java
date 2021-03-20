//package Exercise03;

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
}
