package exercise01.Fibonacci;

public class Fibonacci {
  public static long getNValue (int n) {
    if (n == 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }

    return getNValue(n - 1) + getNValue(n - 2);
  }
}
