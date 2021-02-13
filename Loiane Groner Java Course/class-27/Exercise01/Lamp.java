package Exercise01;

public class Lamp {
  String brand;
  String model;
  double watts;
  int kelvin;
  String type; 
  String lightColor;
  boolean isOn = false;

  void toggleLight () {
    if (!isOn) {
      System.out.println("Lâmpada acesa.");
    } else {
      System.out.println("Lâmpada apagada.");
    };

    isOn = !isOn;
  }
}
