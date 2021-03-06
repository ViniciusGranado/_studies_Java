package exercise02.SumN;

public class SumN {
  public static int getSum(int n) {
    if (n == 1) {
      return n;
    };

    return n + getSum(n - 1);
  }
}
