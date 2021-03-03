package exercise06.ConvertTimeUnits;

public class ConvertTimeUnits {
  public static int minutesToSeconds (int minutes) {
    return minutes * 60;
  }

  public static int hoursToMinutes (int hours) {
    return hours * 60;
  }

  public static int daysTohours (int days) {
    return days * 24;
  }
  
  public static int weeksToDays (int weeks) {
    return weeks * 7;
  }
  
  public static int monthsToDays (int months) {
    return months * 30;
  }

  public static double yearsToDays (int years) {
    return years * 365.25;
  }
}
