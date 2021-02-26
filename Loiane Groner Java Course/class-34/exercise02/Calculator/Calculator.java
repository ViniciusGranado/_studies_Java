package exercise02.Calculator;

public class Calculator {
  public static int sum (int num1, int num2) {
    return num1 + num2;
  }

    public static double sum (double num1, double num2) {
        return num1 + num2;
    }

    public static int subtract (int num1, int num2) {
        return num1 - num2;
    }

    public static double subtract (double num1, double num2) {
        return num1 - num2;
    }

    public static int multiply (int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply (double num1, double num2) {
        return num1 * num2;
    }

    public static double divide (int num1, int num2) {
        return (double) num1 / (double) num2;
    }

    public static double divide (double num1, double num2) {
        return num1 / num2;
    }

    public static double pow (int num1, int num2) {
        return Math.pow(num1, num2);
    }
}
