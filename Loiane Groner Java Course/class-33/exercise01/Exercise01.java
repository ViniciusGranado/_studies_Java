package exercise01;

import exercise01.Lampada.Lampada;

public class Exercise01 {
  public static void main (String[] args) {
    Lampada lampada = new Lampada();

    lampada.setBrand("Eletro");
    lampada.setPrice(3.96);
    lampada.setWatts(500);

    System.out.println(lampada.getBrand());
    System.out.println(lampada.getPrice());
    System.out.println(lampada.getWatts());

    System.out.println(lampada.isIsLampOn());
    lampada.toggleLamp();
    System.out.println(lampada.isIsLampOn());
  }
}
