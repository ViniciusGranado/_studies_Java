package exercise05;

import exercise05.ConvertVolumeUnits.ConvertVolumeUnits;

public class Exercise05 {
  public static void main (String[] args) {
    System.out.println(ConvertVolumeUnits.litersToCm3(1));
    System.out.println(ConvertVolumeUnits.litersToCm3(2.8));
    System.out.println(ConvertVolumeUnits.m3ToLiters(1));
    System.out.println(ConvertVolumeUnits.m3ToLiters(2.8));
    System.out.println(ConvertVolumeUnits.m3ToFt3(1));
    System.out.println(ConvertVolumeUnits.m3ToFt3(2.8));
    System.out.println(ConvertVolumeUnits.gallonToIn3(1));
    System.out.println(ConvertVolumeUnits.gallonToIn3(2.8));
    System.out.println(ConvertVolumeUnits.gallonToLiter(1));
    System.out.println(ConvertVolumeUnits.gallonToLiter(2.8));
  }
}
