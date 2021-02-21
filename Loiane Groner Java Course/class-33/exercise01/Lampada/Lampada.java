package exercise01.Lampada;

public class Lampada {
  private String brand;
  private int watts;
  private double price;
  private boolean isLampOn;

  public Lampada () {
    this.isLampOn = false;
  }

  public String getBrand () {
    return this.brand;
  }

  public void setBrand (String brand) {
    this.brand = brand;
  }

  public int getWatts () {
    return this.watts;
  }

  public void setWatts (int watts) {
    this.watts = watts;
  }

  public double getPrice () {
    return this.price;
  }

  public void setPrice (double price) {
    this.price = price;
  }

  public boolean isIsLampOn () {
    return this.isLampOn;
  }

  public void setIsLampOn (boolean isLampOn) {
    this.isLampOn = isLampOn;
  }

  public void toggleLamp () {
    this.setIsLampOn(!this.isLampOn);
  }
}