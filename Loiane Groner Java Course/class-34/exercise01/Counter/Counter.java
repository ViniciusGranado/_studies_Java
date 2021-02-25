package exercise01.Counter;

public class Counter {
  private static int value;

  public Counter () {
    Counter.incrementValue();
  }

  public static int getValue() {
    return Counter.value;
  }

  public static void resetValue () {
    Counter.value = 0;
  }

  public static void incrementValue () {
    Counter.value++;
  }
}
