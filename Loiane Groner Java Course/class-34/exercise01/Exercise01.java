package exercise01;

import exercise01.Counter.Counter;

public class Exercise01 {
  public static void main (String[] args) {
    System.out.println(Counter.getValue());

    Counter.incrementValue();
    Counter.incrementValue();

    System.out.println(Counter.getValue());

    Counter.resetValue();

    System.out.println(Counter.getValue());

    Counter counter01 = new Counter();
    Counter counter02 = new Counter();
    Counter counter03 = new Counter();

    System.out.println(Counter.getValue());
  }
}