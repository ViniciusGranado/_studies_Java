//package Exercise03;

public class Animal {
  private String name;
  private double length;
  private int numberOfPaws;
  private String color;
  private String environment;
  private double speed;

  Animal () {
    this.numberOfPaws = 4;
  }

  Animal (String name, double length, int numberOfPaws, String color, String environment, double speed) {
    this.name = name;
    this.length = length;
    this.numberOfPaws = numberOfPaws;
    this.color = color;
    this.environment = environment;
    this.speed = speed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public int getNumberOfPaws() {
    return numberOfPaws;
  }

  public void setNumberOfPaws(int numberOfPaws) {
    this.numberOfPaws = numberOfPaws;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }
}