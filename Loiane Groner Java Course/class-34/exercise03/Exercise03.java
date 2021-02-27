package exercise03;

import exercise03.Calculator.Calculator;

public class Exercise03 {
  public static void main (String[] args) {
    System.out.println(Calculator.sum(2, 3));
    System.out.println(Calculator.sum(2.8, 3.6));
    System.out.println(Calculator.sum(2.5, 3));
    System.out.println(Calculator.subtract(2, 3));
    System.out.println(Calculator.subtract(2.8, 3.6));
    System.out.println(Calculator.subtract(2.5, 3));
    System.out.println(Calculator.multiply(2, 3));
    System.out.println(Calculator.multiply(2.8, 3.6));
    System.out.println(Calculator.multiply(2.5, 3));
    System.out.println(Calculator.divide(2, 3));
    System.out.println(Calculator.divide(2.8, 3.6));
    System.out.println(Calculator.divide(2.5, 3));
    System.out.println(Calculator.pow(2, 3));
    System.out.println(Calculator.factorial(10));
  }
}