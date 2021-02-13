public class Exercise01 {
  public static void main (String[] args) {
    Lamp sylvania = new Lamp();

    sylvania.brand = "Sylvania";
    sylvania.model = "Ledvance";
    sylvania.watts = 8.5;
    sylvania.kelvin = 2700;
    sylvania.type = "Led";
    sylvania.lightColor = "White";

    sylvania.toggleLight();
    sylvania.toggleLight();
  }
}